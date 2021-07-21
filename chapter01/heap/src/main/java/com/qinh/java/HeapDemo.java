package com.qinh.java;

/**
 * 堆设置：
 * -Xms10m -Xmx10m
 * -Xms20m -Xmx20m
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:56
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end...");
    }
}
