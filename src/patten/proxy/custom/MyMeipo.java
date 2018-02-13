package patten.proxy.custom;



import java.lang.reflect.Method;


public class MyMeipo implements MyInvocationHandler {

    private MyPersion myPersion;

    public Object getInstance(MyPersion myPersion)throws Exception{
        this.myPersion=myPersion;
        Class clazz=myPersion.getClass();
        System.out.println(clazz);
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("你叫："+this.myPersion.getName()+"想找个："+this.myPersion.getSex());
        System.out.println("开始寻找");
        method.invoke(myPersion,args);
        System.out.println("找到个匹配的");
        return null;
    }
}
