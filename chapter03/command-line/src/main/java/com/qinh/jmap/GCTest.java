package com.qinh.jmap;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * -Xms60m -Xmx60m -XX:SurvivorRatio=8
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/4 9:37
 */
public class GCTest {
    public static void main(String[] args){
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            byte[] arr = new byte[1024 * 100];
            list.add(arr);
            try {
                TimeUnit.MILLISECONDS.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
