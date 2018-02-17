package patten.factory.abstr;


import patten.factory.Roboot;
import patten.factory.RobootC;
import patten.factory.function.RebootFactory;

public class RabootCFactory extends AbstractFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootC();
    }
}
