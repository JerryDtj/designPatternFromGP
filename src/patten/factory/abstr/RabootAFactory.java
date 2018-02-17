package patten.factory.abstr;


import patten.factory.Roboot;
import patten.factory.RobootA;
import patten.factory.function.RebootFactory;

public class RabootAFactory extends AbstractFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootA();
    }
}
