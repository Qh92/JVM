package com.qinh;

/**
 * 指令6：操作数栈管理指令
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/30 16:06
 */
public class StackOperateTest {
    public void print(){
        Object obj = new Object();
//        String info = obj.toString();
        obj.toString();
    }
    //类似的
    public void foo(){
        bar();
    }
    public long bar(){
        return 0;
    }

    public long nextIndex() {
        return index++;
    }

    private long index = 0;
}
