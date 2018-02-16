package patten.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import patten.proxy.Zhouxinxin;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class CgMeipo implements MethodInterceptor {


    public Object getInstance(String className)throws Exception{
        Enhancer enhancer = new Enhancer();
        Class clazz = Class.forName(className);
        //这一步就是告诉cglib，生成的子类需要继承哪个类，只需要一个类名就可以类，不需要传入这个类的对象
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //把生成到class类写入到磁盘
//        byte[] data = ProxyGenerator.generateProxyClass(o.getClass().getName(),new Class[]{CgZhouxinxin.class});
//        FileOutputStream outputStream = new FileOutputStream("/Users/dengtianjiao/IdeaProjects/learn/designPattern/src/patten/proxy/cglib/"+o.getClass().getName()+".class");
//        outputStream.write(data);
//        outputStream.close();
        System.out.println("开始寻找");
        //这个Object的引用是由CGLib给我们new出来的
        //cglib new出来以后的对象，是被代理对象的子类（继承了我们自己写的那个类）
        //OOP, 在new子类之前，实际上默认先调用了我们super()方法的，
        //new了子类的同时，必须先new出来父类，这就相当于是间接的持有了我们父类的引用
        //子类重写了父类的所有的方法
        //我们改变子类对象的某些属性，是可以间接的操作父类的属性的
        methodProxy.invokeSuper(o,objects);
        System.out.println("找到个匹配的");
        return null;
    }
}
