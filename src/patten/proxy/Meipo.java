package patten.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {

    private Persion persion;

    public Object getInstance(Persion persion)throws Exception{
        this.persion=persion;
        Class clazz=persion.getClass();
        System.out.println(clazz);
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你叫："+this.persion.getName()+"想找个："+this.persion.getSex());
        System.out.println("开始寻找");
        method.invoke(persion,args);
        System.out.println("找到个匹配的");
        return null;
    }
}
