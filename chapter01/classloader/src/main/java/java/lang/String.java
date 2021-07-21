package java.lang;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-06-15-0:20
 */
public class String {
    static{
        System.out.println("我是自定义的String类的静态代码块");
    }
    //错误: 在类 java.lang.String 中找不到 main 方法
    public static void main(String[] args) {
        System.out.println("hello,String");
    }
}
