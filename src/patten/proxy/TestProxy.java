package patten.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class TestProxy {
    public static void main(String[] args) {
        try {
            Persion persion = (Persion) new Meipo().getInstance(new Zhouxinxin());
            System.out.println(persion.getClass());
            persion.findLive();

            byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Persion.class});
            FileOutputStream outputStream = new FileOutputStream("/Users/dengtianjiao/IdeaProjects/learn/designPattern/src/patten/proxy/$Proxy0.class");
            outputStream.write(data);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
