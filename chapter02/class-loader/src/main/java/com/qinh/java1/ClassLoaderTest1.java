package com.qinh.java1;

/**
 * @author Qh
 * @version 1.0
 * @date 2021/8/2 15:18
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        //获取扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@1540e19d
        //试图获取引导类加载器：失败
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);//null

        //###########################
        try {
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);
            //自定义的类默认使用系统类加载器
            ClassLoader classLoader1 = Class.forName("com.qinh.java1.ClassLoaderTest1").getClassLoader();
            System.out.println(classLoader1);

            //关于数组类型的加载:使用的类的加载器与数组元素的类的加载器相同
            String[] arrStr = new String[10];
            System.out.println(arrStr.getClass().getClassLoader());//null:表示使用的是引导类加载器

            ClassLoaderTest1[] arr1 = new ClassLoaderTest1[10];
            System.out.println(arr1.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2

            //基本数据类型不需要加载，由JVM虚拟机内置
            int[] arr2 = new int[10];
            System.out.println(arr2.getClass().getClassLoader());//null:不需要类的加载器

            /*
            Launcher#Launcher():
            Launcher.ExtClassLoader var1;
            try {
                var1 = Launcher.ExtClassLoader.getExtClassLoader();
            } catch (IOException var10) {
                throw new InternalError("Could not create extension class loader", var10);
            }

            try {
                this.loader = Launcher.AppClassLoader.getAppClassLoader(var1);
            } catch (IOException var9) {
                throw new InternalError("Could not create application class loader", var9);
            }
            //将系统类加载器设置为当前线程的上下文类加载器
            Thread.currentThread().setContextClassLoader(this.loader);
             */
            //Thread.currentThread().setContextClassLoader(extClassLoader);
            //默认是系统类加载器：sun.misc.Launcher$AppClassLoader@18b4aac2
            System.out.println(Thread.currentThread().getContextClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
