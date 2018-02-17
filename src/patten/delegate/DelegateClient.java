package patten.delegate;

public class DelegateClient {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(new RobootA());
        System.out.println(dispatcher.doing());
    }
}
