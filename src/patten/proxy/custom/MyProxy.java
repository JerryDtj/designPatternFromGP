package patten.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 生成代理对象
 */
public class MyProxy {

    protected MyInvocationHandler h;

    protected MyProxy(MyInvocationHandler h){
        this.h = h;
    }

    public static Object newProxyInstance(MyClassLoader loader,Class<?>[] interfaces,MyInvocationHandler invocationHandler) throws IllegalArgumentException{
        //1、生成源代码
        String proxySrc = generateSrc(interfaces[0]);
        //2、将生成的源代码输出到磁盘保存为java文件
        try {
            String path = MyProxy.class.getResource("").getPath();
//            String path = System.getProperty("user.dir")+"/src/patten/proxy/custom/";
            File f = new File(path + "$Proxy0.java");
            FileWriter writer = new FileWriter(f);
            writer.write(proxySrc);
            writer.flush();
            writer.close();

            //3、编译生成class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);

            CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();
            //4、将class文件加载到jvm中
            Class proxyClass = loader.findClass("$Proxy0");
            //5、返回被代理后的对象
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            return c.newInstance(invocationHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    /**
     * 重新生成一个代理对象的实例
     * @param interfaces
     * @return
     */
    public static String generateSrc(Class<?> interfaces){
        String ln = "\r\n";
        StringBuffer buffer = new StringBuffer("package patten.proxy.custom;").append(ln);
        buffer.append("import java.lang.reflect.Method;").append(ln);
        buffer.append("import java.lang.reflect.UndeclaredThrowableException;").append(ln);
        buffer.append("public final class $Proxy0 extends MyProxy implements ").append(interfaces.getName()).append("{").append(ln);
        //初始化构造方法
        buffer.append("public $Proxy0(MyInvocationHandler var1){").append(ln).append("super(var1);").append(ln).append(" }").append(ln);

        for (Method m:interfaces.getMethods()){
            buffer.append("private static Method ").append(m.getName()).append(";").append(ln);
        }
        //初始化method
        for (Method m:interfaces.getMethods()){
            buffer.append("public ").append(m.getReturnType().getName()).append(" ").append(m.getName()).append("()").append("{").append(ln);
            buffer.append("try{");
            if (!m.getReturnType().getName().equals("void")){
                buffer.append("return ("+m.getReturnType().getName()+")");
            }
            buffer.append("this.h.invoke(this,"+m.getName()+",null);").append(ln);
            buffer.append("}catch (Throwable throwable) {throw new UndeclaredThrowableException(throwable);}").append(ln);
            buffer.append("}").append(ln);
        }

        //初始化方法块
        buffer.append("static { try{").append(ln);
        for (Method m:interfaces.getMethods()){
            //拼接method初始化方法
            buffer.append(m.getName()).append(" = ").append(" Class.forName(\"").append(interfaces.getName()).append("\").getMethod(\"").append(m.getName()).append("\");").append(ln);
        }
        buffer.append("} catch (NoSuchMethodException var2) {").append(ln).append("throw new NoSuchMethodError(var2.getMessage());").append(ln).append("} catch (ClassNotFoundException var3) {").append(ln).append("throw new NoClassDefFoundError(var3.getMessage());").append(ln).append("}").append(ln).append("}").append(ln);


        buffer.append("}");
        return buffer.toString();
    }
}
