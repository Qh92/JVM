package com.qinh.jdk9;

/**
 * JDK9类加载器
 *
 * @author Qh
 * @version 1.0
 * @date 2021-08-03-22:06
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());

        //获取系统类加载器
        System.out.println(ClassLoader.getSystemClassLoader());
        //获取平台类加载器
//        System.out.println(ClassLoader.getPlatformClassLoader());
        //获取类的加载器的名称
//        System.out.println(ClassLoaderTest.class.getClassLoader().getName());
    }
}
