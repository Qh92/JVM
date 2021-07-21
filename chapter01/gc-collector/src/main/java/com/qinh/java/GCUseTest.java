package com.qinh.java;

import java.util.ArrayList;
import java.util.List;

/**
 * -XX:+PrintCommandLineFlags
 * -XX:+UseSerialGC：表明新生代使用Serial GC，同时老年代使用Serial Old GC
 * -XX:+UseParNewGC：表示新生代使用ParNew GC
 *      -XX:+UseConcMarkSweepGC
 *
 *  -XX:+UseParallelGC:表明新生代使用Parallel GC
 *  -XX:+UseParallelOldGC:表明老年代使用Parallel Old GC
 *  说明：两者可以互相激活
 *  -XX:+UseAdaptiveSizePolicy:默认开启，自适应调节策略
 *
 *  -XX:+UseConcMarkSweepGC:表明老年代使用CMS GC 同时，年轻代会触发对UseParNewGC的使用
 *
 *  -XX:+UseG1GC:表明使用G1
 *
 * @author Qh
 * @version 1.0
 * @date 2021-07-17-16:02
 */
public class GCUseTest {

    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true){
            byte[] arr = new byte[100];
            list.add(arr);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
