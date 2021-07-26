package com.qinh;

/**
 * 测试是否采用引用计数算法
 * -Xms20m -Xmx20m -XX:+PrintGCDetails
 *
 * 证明JVM中采用的不是引用计数器的算法
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/26 10:38
 */
public class RefCountGC {
    private byte[] bigSize = new byte[1024 * 1024 * 5];
    /** 引用 */
    Object reference = null;

    public static void main(String[] args){
        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();

        obj1.reference = obj2;
        obj2.reference = obj1;

        obj1 = null;
        obj2 = null;
        // 显示的执行垃圾收集行为
        // 这里发生GC，obj1和obj2是否被回收？
        System.gc();
    }
}
