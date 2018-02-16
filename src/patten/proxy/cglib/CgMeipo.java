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
        methodProxy.invokeSuper(o,objects);
        System.out.println("找到个匹配的");
        return null;
    }
}
