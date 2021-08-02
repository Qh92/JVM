package com.qinh.java;

/**
 * 过程三：初始化阶段
 * 会生成<clinit>()方法
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/2 9:32
 */
public class InitializationTest {
    public static int id = 1;
    public static int number;

    static {
        number = 2;
        System.out.println("father static{}");
    }
}
