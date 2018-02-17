package patten.factory.simple;

public class SimpleReflexFactory {
    public <T>T makePersion(Class clazz){
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
