package com.qinh.java1;

/**
 * 动态链接
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:36
 */
public class DynamicLinkingTest {
    int num = 10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }
}
