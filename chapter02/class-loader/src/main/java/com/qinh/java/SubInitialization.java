package com.qinh.java;

/**
 * 子类调用父类声明的字段时，会先初始化父类
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/2 9:44
 */
public class SubInitialization extends InitializationTest {
    static{
        number = 4;//number属性必须提前已经加载：一定会先加载父类。
        System.out.println("son static{}");
    }

    public static void main(String[] args) {
        System.out.println(number);
    }

}
