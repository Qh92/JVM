package com.qinh.jmap;

import java.util.concurrent.TimeUnit;

/**
 * 线程waiting测试
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/4 17:43
 */
public class ThreadSleepTest {
    public static void main(String[] args){
        System.out.println("hello -1");
        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello -2");
    }
}
