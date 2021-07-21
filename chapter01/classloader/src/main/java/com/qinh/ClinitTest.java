package com.qinh;

/**
 * 初始化：
 * 1.初始化阶段就是执行类构造器方法<clinit>()的过程
 * 2.此方法不需要定义，是javac编译器自动收集类中的所有类变量的赋值动作和静态代码块中的语句合并而来
 * 3.构造器方法中指令按语句在源文件中出现的顺序执行
 * 4.<clinit>()不同于类的构造器。(关联：构造器是虚拟机视角下的<init>())
 * 5.若该类具有父类，JVM会保证子类的<clinit>()执行前，父类的<clinit>()已经执行完毕
 * 6.虚拟机必须保证一个类的<clinit>()方法在多线程下被同步加锁
 *
 * 任何一个类声明以后，内部至少存在一个类的构造器
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-14-0:03
 */
public class ClinitTest {
    private int a = 1;
    private static int c = 3;

    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest() {
        a = 10;
        int d = 20;
    }
}
