package patten.factory.function;


import patten.factory.Roboot;
import patten.factory.RobootB;

public class RabootBFactory implements  RebootFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootB();
    }
}
