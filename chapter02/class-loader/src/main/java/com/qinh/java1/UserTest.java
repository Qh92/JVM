package com.qinh.java1;

/**
 * @author Qh
 * @version 1.0
 * @date 2021/8/2 11:23
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User(); //隐式加载

        try {
            Class clazz = Class.forName("com.qinh.java.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.qinh.java.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
