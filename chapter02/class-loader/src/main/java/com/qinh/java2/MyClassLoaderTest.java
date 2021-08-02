package com.qinh.java2;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-08-02-23:38
 */
public class MyClassLoaderTest {

    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader("E:\\");

        try {
            Class<?> clazz = loader.loadClass("Demo1");
            System.out.println("加载此类的类加载器为: " + clazz.getClassLoader().getClass().getName());
            System.out.println("当前加载器的父类加载器为: " + clazz.getClassLoader().getParent().getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
