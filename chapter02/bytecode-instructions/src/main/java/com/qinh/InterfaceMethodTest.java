package com.qinh;

/**
 * 补充：方法调用指令的补充说明
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/29 17:48
 */
public class InterfaceMethodTest {
    public static void main(String[] args) {
        AA aa = new BB();

        //invokeinterface #4 <com/qinh/AA.method2> count 1
        //调用接口方法
        aa.method2();

        //invokestatic #5 <com/qinh/AA.method1>
        //调用静态方法
        AA.method1();
    }
}

interface AA{
    public static void method1(){

    }
    public default void method2(){

    }
}

class BB implements AA{

}
