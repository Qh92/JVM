package com.qinh;

/**
 * 类的加载过程：加载 -> 链接(验证 -> 准备 -> 解析) -> 初始化
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-13-23:37
 */
public class ClassInitTest {

    private static int num = 3;

    static {
        num = 22;
        number = 33;
        System.out.println(num);
        //报错，非法的前向引用
//        System.out.println(number);
    }

    /**
     * linking prepare:number = 0 --> initial:33 --> 10
     */
    private static int number = 10;

    public static void main(String[] args) {

        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }
}
