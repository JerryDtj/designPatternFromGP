package patten.factory;

import patten.proxy.Persion;

public class Zhouxinxin implements Persion {
    @Override
    public String getName() {
        return "我叫周鑫鑫";
    }

    @Override
    public String getSex() {
        return "周鑫星是男的";
    }

    @Override
    public void findLive() {
        System.out.println("周鑫鑫同学开始找房子");
    }
}
