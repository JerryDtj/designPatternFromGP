package patten.factory.simple;

import patten.factory.Roboot;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        SimpleRobootFactory simpleFactory = new SimpleRobootFactory();
        Roboot roboot = simpleFactory.makeRoboot("A");
        System.out.println(roboot.getName());
    }

}
