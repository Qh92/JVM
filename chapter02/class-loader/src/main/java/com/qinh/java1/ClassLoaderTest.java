package com.qinh.java1;

import java.net.URL;

/**
 * 类加载器
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/2 15:01
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println("**********启动类加载器**************");
        //引导类加载器加载 JAVA_HOME/jre/lib/rt.jar或者sun.boot.class.path路径下的类
        //获取BootstrapClassLoader能够加载的api的路径
        URL[] urLs = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }
        //从上面的路径中随意选择一个类,来看看他的类加载器是什么:引导类加载器
        ClassLoader classLoader = java.security.Provider.class.getClassLoader();
        System.out.println(classLoader);

        System.out.println("***********扩展类加载器*************");
        //从系统属性java.ext.dirs所指定的目录中加载类库或JAVA_HOME/jre/lib/ext目录下加载类库
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(";")) {
            System.out.println(path);
        }
//
//        //从上面的路径中随意选择一个类,来看看他的类加载器是什么:扩展类加载器
        ClassLoader classLoader1 = sun.security.ec.CurveDB.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@1540e19d

    }
}
