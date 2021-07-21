package com.qinh.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * GC log测试
 * -Xms60m -Xmx60m -XX:+PrintGC
 * -XX:+PrintGC 输出GC日志。类似：-verbose:gc
 * -XX:+PrintGCDetails 输出GC的详细日志
 * -XX:+PrintGCTimeStamps 输出GC的时间戳（以基准时间的形式）
 * -XX:+PrintGCDateStamps 输出GcC的时间戳（以日期的形式，如2013-05-04T21：53：59.234+0800）
 * -XX:+PrintHeapAtGC 在进行GC的前后打印出堆的信息
 * -Xloggc:./logs/gc.log 日志文件的输出路径
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/19 17:32
 */
public class GCLogTest {
    public static void main(String[] args){
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            //100kb
            byte[] arr = new byte[1024 * 100];
            list.add(arr);
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
