package patten.factory.simple;

import patten.factory.LinZhiling;
import patten.factory.ZhoudDafu;
import patten.factory.Zhouxinxin;
import patten.proxy.Persion;

public class SimpleFactory {
    public Persion makePersion(String name){
        switch (name){
            case "周星星":
                return new Zhouxinxin();
            case "周大福":
                return new ZhoudDafu();
            case "林志玲":
                return new LinZhiling();
            default:
                System.out.println("不知道你要造什么人，返回null");
                return null;
        }
    }

}
