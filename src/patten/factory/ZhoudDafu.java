package patten.factory;

import patten.proxy.Persion;

public class ZhoudDafu implements Persion {
    @Override
    public String getName() {
        return "我叫周大福";
    }

    @Override
    public String getSex() {
        return "周大福是男的";
    }

    @Override
    public void findLive() {
        System.out.println("周大福同学开始找房子");
    }
}
