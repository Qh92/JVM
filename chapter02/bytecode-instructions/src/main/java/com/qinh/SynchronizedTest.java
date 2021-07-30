package com.qinh;

/**
 * 指令9：同步控制指令
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/30 15:12
 */
public class SynchronizedTest {
    private int i = 0;
    public synchronized void add(){
        i++;
    }


    private Object obj = new Object();
    public void subtract(){

        synchronized (obj){
            i--;
        }
    }
}
