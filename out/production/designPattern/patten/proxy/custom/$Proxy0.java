package patten.proxy.custom;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends MyProxy implements patten.proxy.custom.MyPersion {
    public $Proxy0(MyInvocationHandler var1) {
        super(var1);
    }

    private static Method getName;
    private static Method findLive;
    private static Method getSex;

    public java.lang.String getName() {
        try {
            return (java.lang.String) this.h.invoke(this, getName, null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public void findLive() {
        try {
            this.h.invoke(this, findLive, null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    public java.lang.String getSex() {
        try {
            return (java.lang.String) this.h.invoke(this, getSex, null);
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    static {
        try {
            getName = Class.forName("patten.proxy.custom.MyPersion").getMethod("getName");
            findLive = Class.forName("patten.proxy.custom.MyPersion").getMethod("findLive");
            getSex = Class.forName("patten.proxy.custom.MyPersion").getMethod("getSex");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}