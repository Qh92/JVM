package com.qinh.java;

/**
 * 局部变量表槽位复用
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-23-0:39
 */
public class SlotTest {
    /**
     * 当前方法中有4个局部变量，其分别对应变量槽的index为
     * this 0 占用一个槽位
     * a    1 占用一个槽位
     * l    2 占用两个槽位
     * b    4 占用一个槽位
     */
    public void localVarl() {
        int a = 0;
        System.out.println(a);
        long l = 1L;
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        //此时的b就会复用a的槽位
        int b = 0;
    }
}
