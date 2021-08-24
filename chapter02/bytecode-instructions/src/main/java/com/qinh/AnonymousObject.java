package com.qinh;

/**
 * 匿名对象的字节码
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/24 14:49
 */
public class AnonymousObject {
    public static void main(String[] args){
    }

    public void test(){
        int num = 10;
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("匿名子类的匿名对象 " + num);
            }
        };
    }
}
