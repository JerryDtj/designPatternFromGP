package patten.delegate;

/**
 * 委派模式
 */
public class Dispatcher implements Roboot {

    //声明具体的接口
    private Roboot roboot;

    //声明一个带参数的构造方法，把传入的机器人对象赋值给声明的接口
    public Dispatcher(Roboot roboot){
        this.roboot = roboot;
    }

    @Override
    public String doing() {
        //调用传入具体对象的方法。而不是自己去实现
        return this.roboot.doing();
    }
}
