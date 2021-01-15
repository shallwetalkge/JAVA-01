package jvm;

import java.io.*;
import java.lang.reflect.Method;

/**
 * @description: java训练营：week1作业（自定义类加载器）
 * @author: shallwetalk
 * @time: 2021/1/10 18:23
 * @since: 1.8.0
 * @version: 0.0.1
 */
public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) throws Exception{

        Class clazz = new HelloClassLoader().findClass("\\Week_01\\src\\jvm\\Hello.xlass","Hello");
        Method method = clazz.getMethod("hello");
        method.invoke(clazz.newInstance());
    }

    protected Class<?> findClass(String path,String name) throws Exception {
        String property = System.getProperty("user.dir");
        FileInputStream in = new FileInputStream(new File(property+path));
        byte[] bs = new byte[in.available()];
        for (int i = 0;i<bs.length;i++){
            bs[i] = (byte) (255-in.read());
        }
        return defineClass(name,bs,0,bs.length);
    }
}
