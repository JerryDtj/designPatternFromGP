package patten.factory.function;


import patten.factory.Roboot;
import patten.factory.RobootA;

public class RabootAFactory implements  RebootFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootA();
    }
}
