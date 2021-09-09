package com.qinh.java.exer;

import java.util.concurrent.TimeUnit;

/**
 * volatile:保存线程可见性，禁止指令重排序（保证指令之间执行的有序性）
 * JMM内存模型
 *
 * @author Qh
 * @version 1.0
 * @date 2021/9/9 17:17
 */
public class T01_ThreadVisibility {
    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag){
            }
            System.out.println("end");
        },"server").start();
        TimeUnit.SECONDS.sleep(1);
        flag = false;
    }


}
