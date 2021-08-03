package com.qinh.java1;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-08-03-21:44
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        //Object类的加载只能使用引导类加载器进行！
        Object object = new Object();
    }
}
