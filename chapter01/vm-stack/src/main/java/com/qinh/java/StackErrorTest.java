package com.qinh.java;

/**
 * 单线程下：StackOverflowError
 * 多线程下：OutOfMemoryError
 *  默认情况下：count : 11425
 *  设置栈的大小： -Xss256k : count : 2465
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-23-0:35
 */
public class StackErrorTest {

    private static int count = 1;
    public static void main(String[] args) {
        /*System.out.println(count);
        count++;*/

        for (int i = 0; i < 10; i++) {
            new Thread(StackErrorTest::method1).start();
        }
        //main(args);
    }

    private static void method1(){
        method1();
    }


}
