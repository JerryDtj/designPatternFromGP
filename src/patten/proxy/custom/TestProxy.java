package patten.proxy.custom;


import java.io.File;

public class TestProxy {
    public static void main(String[] args) {
        try {
//            new MyMeipo().getInstance(new MyZhouxinxin());
            MyPersion persion = (MyPersion) new MyMeipo().getInstance(new MyZhouxinxin());
            System.out.println(persion.getClass());
            persion.findLive();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
