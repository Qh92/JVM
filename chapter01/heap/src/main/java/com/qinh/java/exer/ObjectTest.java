package com.qinh.java.exer;

/**
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
    }


}
