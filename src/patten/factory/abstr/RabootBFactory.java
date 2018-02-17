package patten.factory.abstr;


import patten.factory.Roboot;
import patten.factory.RobootB;
import patten.factory.function.RebootFactory;

public class RabootBFactory extends AbstractFactory{

    @Override
    public Roboot makeReboot() {
        return new RobootB();
    }
}
