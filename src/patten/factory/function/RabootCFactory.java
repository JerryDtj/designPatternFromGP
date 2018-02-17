package patten.factory.function;


import patten.factory.Roboot;
import patten.factory.RobootC;

public class RabootCFactory implements  RebootFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootC();
    }
}
