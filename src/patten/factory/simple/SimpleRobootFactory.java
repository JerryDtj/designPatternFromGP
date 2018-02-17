package patten.factory.simple;

import patten.factory.Roboot;
import patten.factory.RobootA;
import patten.factory.RobootB;
import patten.factory.RobootC;

public class SimpleRobootFactory {

    public Roboot makeRoboot(String name){
        switch (name){
            case "A":
                return new RobootA();
            case "B":
                return new RobootB();
            case "c":
                return new RobootC();
            default:
                System.out.println("找不到对应的型号，返回null");
                return null;
        }
    }
}
