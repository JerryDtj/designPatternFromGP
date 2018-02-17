package patten.factory.simple;

import patten.factory.LinZhiling;
import patten.proxy.Persion;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Persion persion = simpleFactory.makePersion("林志玲");
        persion.findLive();

        SimpleReflexFactory simpleReflexFactory = new SimpleReflexFactory();
        Persion persion1 = simpleReflexFactory.makePersion(LinZhiling.class);
        System.out.println(persion1.getSex());


    }
}
