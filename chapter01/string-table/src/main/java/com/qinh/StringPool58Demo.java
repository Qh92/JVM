package com.qinh;

/**
 * 字符串常量池
 *
 * @author Qh
 * @version 1.0
 * @date 2021-10-04-8:58
 */
public class StringPool58Demo {
    public static void main(String[] args) {
        String str = new String("11");
        //true，说明字符串常量池中已有该字符串
        System.out.println("11" == str.intern());
        String s = new String("qin") + new String("hao");


        String str1 = new StringBuilder("mei").append("tuan").toString();
        //true
        System.out.println(str1 == str1.intern());

        System.out.println();

        String str2 = new StringBuilder("ja").append("va").toString();
        /*
        sun.misc.Version类会在JDK类库的初始化过程中被加载并初始化，而在初始化时它需要对静态常量字段根据指定的常量值(ConstantValue)
        做默认初始化，此时被sun.misc.Version.launcher静态常量字段所引用的"java"字符串字面量就被intern到HotSpot VM的字符串常量池中
         */
        //false
        System.out.println(str2 == str2.intern());
    }
}
