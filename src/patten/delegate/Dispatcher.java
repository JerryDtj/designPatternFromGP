package patten.delegate;

public class Dispatcher implements Roboot {

    private Roboot roboot;

    public Dispatcher(Roboot roboot){
        this.roboot = roboot;
    }

    @Override
    public String doing() {
        return this.roboot.doing();
    }
}
