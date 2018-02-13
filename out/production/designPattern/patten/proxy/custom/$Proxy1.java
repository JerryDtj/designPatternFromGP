package patten.proxy.custom;

import java.lang.reflect.Method;

public class $Proxy1 implements patten.proxy.custom.MyPersion {
    MyInvocationHandler h;

    public $Proxy0(MyInvocationHandler h) {
        this.h = h;
    }

    public void findLive() {
        try {
            Method m = patten.proxy.custom.MyPersion.class.getMethod("findLive", new Class[]{});
            this.h.invoke(this, m, null);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}