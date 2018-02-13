package patten.proxy.custom;

import java.io.*;

/**
 * 重新动态加载到jvm中
 */
public class MyClassLoader extends ClassLoader {

    private File file;

    public MyClassLoader(){
        String path = MyClassLoader.class.getResource("").getPath();
        this.file = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+"."+name;
        if (file!=null){
            File classFile = new File(file,name.replace("\\.","/")+".class");
            if (classFile.exists()){
                FileInputStream inputStream = null;
                ByteArrayOutputStream outputStream = null;
                try {
                    inputStream = new FileInputStream(classFile);
                    outputStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buffer))!=-1){
                        outputStream.write(buffer,0,len);
                    }
                    return defineClass(className,outputStream.toByteArray(),0,outputStream.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    try {
                        if (null!=inputStream){
                            inputStream.close();
                        }
                        if(null!=outputStream){
                            outputStream.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return null;
    }
}
