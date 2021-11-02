package com.qinh.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * OOM测试: java.lang.OutOfMemoryError: GC overhead limit exceeded
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 *
 * @author Qh
 * @version 1.0
 * @date 2021-11-02 23:01
 */
public class GCOverheadDemo {
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();

        try {
            while (true) {
                list.add(String.valueOf(++i).intern());
            }
        } catch (Throwable e) {
            System.out.println("***************i:" + i);
            e.printStackTrace();
            throw e;
        }

    }
}
