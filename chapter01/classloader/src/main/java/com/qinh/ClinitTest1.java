package com.qinh;

/**
 * init:父类优先于子类初始化
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-14-0:14
 */
public class ClinitTest1 {

    static class Father{
        public static int A = 1;
        static{
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
