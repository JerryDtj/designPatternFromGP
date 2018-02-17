package patten.factory.abstr;

import patten.factory.Roboot;

public class RebootFactory extends AbstractFactory {

    private AbstractFactory abstractFactory = new RabootAFactory();

    @Override
    Roboot makeReboot() {
        return abstractFactory.makeReboot();
    }
}
