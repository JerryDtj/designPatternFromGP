package patten.factory.simple;

import patten.factory.Roboot;
import patten.factory.RobootA;
import patten.factory.RobootB;
import patten.factory.RobootC;

public class SimpleRobootReflexFactory {

    public <T>T makeRoboot(Class clazz){
        T result = null;
        try {
            result = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
