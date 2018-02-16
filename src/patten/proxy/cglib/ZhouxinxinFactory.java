package patten.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class ZhouxinxinFactory {
    private ZhouxinxinFactory(){

    }

    public static Object getInstance(CgMeipo cgMeipo)throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(new CgZhouxinxin().getClass());
        enhancer.setCallback(cgMeipo);
        return enhancer.create();
    }
}
