package com.qinh;

import java.util.concurrent.TimeUnit;

/**
 * 栈的测试
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-13-18:24
 */
public class StackStruTest {
    public static void main(String[] args) {
        //javap -v StackStruTest.class 反编译字节码
        //int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
