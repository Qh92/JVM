package com.qinh;

/**
 * 用户自定义java.lang.String类
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-15-0:20
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String();
        System.out.println("hello");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());
    }
}
