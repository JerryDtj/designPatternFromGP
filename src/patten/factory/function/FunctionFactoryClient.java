package patten.factory.function;


import patten.factory.Roboot;

public class FunctionFactoryClient {
    public static void main(String[] args) {
        RebootFactory rebootFactory = new RabootAFactory();
        Roboot roboot = rebootFactory.makeReboot();
        System.out.println(roboot.getName());
    }
}
