package patten.proxy.cglib;


import patten.proxy.Zhouxinxin;

public class TestProxy {
    public static void main(String[] args) {
        try {
//           CgZhouxinxin zhouxinxin = (CgZhouxinxin) ZhouxinxinFactory.getInstance(new CgMeipo());
//           zhouxinxin.findLive();

           CgZhouxinxin zxx = (CgZhouxinxin) new CgMeipo().getInstance(CgZhouxinxin.class.getName());
           zxx.findLive();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
