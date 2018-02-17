package patten.factory.abstr;

import patten.factory.Roboot;
import patten.factory.RobootA;
import patten.factory.RobootB;
import patten.factory.RobootC;

public abstract class AbstractFactory {
    abstract Roboot makeReboot();
    public Roboot makeRoboot(String name){
        switch (name){
            case "B":
                return new RobootB();
            case "A":
                return new RobootA();
            case "c":
                return new RobootC();
            default:
                System.out.println("找不到对应的型号，返回null");
                return null;
        }
    }
}
