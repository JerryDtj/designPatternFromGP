package patten.proxy.custom;

public class TestProxy {
    public static void main(String[] args) {
        try {
            MyPersion persion = (MyPersion) new MyMeipo().getInstance(new MyZhouxinxin());
            System.out.println(persion.getClass());
            persion.findLive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
