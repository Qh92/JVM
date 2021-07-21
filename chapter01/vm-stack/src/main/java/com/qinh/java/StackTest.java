package com.qinh.java;

/**
 * 栈测试
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-23-0:28
 */
public class StackTest {

    public static void main(String[] args) {
        StackTest test = new StackTest();
        test.methodA();
    }

    public void methodA() {
        int i = 10;
        int j = 20;

        methodB();
    }

    public void methodB(){
        int k = 30;
        int m = 40;
    }

}
