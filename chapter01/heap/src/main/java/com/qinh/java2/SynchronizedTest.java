package com.qinh.java2;

/**
 * 同步省略说明
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-23:03
 */
public class SynchronizedTest {
    public void f() {
        Object hollis = new Object();
        synchronized(hollis) {
            System.out.println(hollis);
        }
    }
}
