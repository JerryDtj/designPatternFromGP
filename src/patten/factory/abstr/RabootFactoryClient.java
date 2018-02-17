package patten.factory.abstr;

import patten.factory.Roboot;

public class RabootFactoryClient {
    public static void main(String[] args) {
        RebootFactory factory = new RebootFactory();
        Roboot roboot = factory.makeReboot();
        System.out.println(roboot.getName());
        roboot = factory.makeRoboot("B");
        System.out.println(roboot.getName());

    }
}
