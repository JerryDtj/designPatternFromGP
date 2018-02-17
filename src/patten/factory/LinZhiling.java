package patten.factory;

import patten.proxy.Persion;

public class LinZhiling implements Persion {
    @Override
    public String getName() {
        return "我叫林志玲";
    }

    @Override
    public String getSex() {
        return "林志玲是女的";
    }

    @Override
    public void findLive() {
        System.out.println("林志玲同学开始找房子");
    }
}
