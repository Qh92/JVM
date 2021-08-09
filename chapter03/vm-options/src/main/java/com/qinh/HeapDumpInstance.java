package com.qinh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * -XX:+HeapDumpOnOutOfMemoryError
 * -XX:+HeapDumpBeforeFullGC
 * -XX:HeapDumpPath=E:\error.hprof
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/9 14:29
 */
public class HeapDumpInstance {
    private static int _1MB = 1024 * 1024;
    byte[] buffer = new byte[10 * _1MB];

    public static void main(String[] args){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<HeapDumpInstance> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            list.add(new HeapDumpInstance());
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序执行结束");
    }

}
