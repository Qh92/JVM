package com.qinh.java.exer;

import org.openjdk.jol.info.ClassLayout;

/**
 * 定位：分析对象在JVM的大小和分布
 *
 * new Object();
 *
 * @author Qh
 * @version 1.0
 * @date 2021/9/9 17:08
 */
public class ObjectTest {

    volatile int i;

    public void m(){
        System.out.println("hello jvm");
    }

    public static void main(String[] args){
        Object o = new Object();
        //对象的内存布局，对象占用的内存大小要被8整除
        //考虑是否开启压缩指针
        /*
        ava.lang.Object object internals:
         OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
              0     4        (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
              4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
              8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
             12     4        (loss due to the next object alignment)
        Instance size: 16 bytes
        Space losses: 0 bytes internal + 4 bytes external = 4 bytes total

        前两项为Mark Word，第三项为Klass pointer 第四项为对齐填充
         */
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        //给对象上锁
        synchronized (o){
            /*
            java.lang.Object object internals:
             OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
                  0     4        (object header)                           68 f2 72 02 (01101000 11110010 01110010 00000010) (41087592)
                  4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
                  8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
                 12     4        (loss due to the next object alignment)
            Instance size: 16 bytes
            Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
             */
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }

        System.out.println("------------");
        Q q = new Q();
        System.out.println(ClassLayout.parseInstance(q).toPrintable());

        System.out.println("===============");
        /*
        OFFSET  SIZE      TYPE DESCRIPTION                               VALUE
          0     4           (object header)                                 01 00 00 00 (00000001 00000000 00000000 00000000) (1)
          4     4           (object header)(8字节的markword)                 00 00 00 00 (00000000 00000000 00000000 00000000) (0)
          8     4           (object header)(4字节的Klass Pointer)            05 00 00 f8 (00000101 00000000 00000000 11111000) (-134217723)
         12     4           (object header)(4字节的数组长度)                  0a 00 00 00 (00001010 00000000 00000000 00000000) (10)
         16    10   boolean [Z.<elements>(数组数据的长度)                             N/A
         26     6           (loss due to the next object alignment)
        Instance size: 32 bytes
         */
        boolean[] b = new boolean[10];
        System.out.println(ClassLayout.parseInstance(b).toPrintable());
    }


}
class Q {
    /**
     * 单个boolean占用1个字节
     * boolean[] 占用4个字节
     */
    //boolean b = false;
    boolean[] b = new boolean[1];
}