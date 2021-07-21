package com.qinh.java1;

import java.lang.reflect.Field;

/**
 * 结论：
 * 静态引用对应的对象实体始终都存在堆空间
 *
 * jdk7：
 * -Xms200m -Xmx200m -XX:PermSize=300m -XX:MaxPermSize=300m -XX:+PrintGCDetails
 * jdk 8：
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/9 10:50
 */
public class StaticFieldTest {
    private static byte[] arr = new byte[1024 * 1024 * 100];//100MB

    public static void main(String[] args) {
        StaticFieldTest fieldTest = new StaticFieldTest();
        fieldTest.init();

        System.out.println(StaticFieldTest.arr);

        /*try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public void init(){
        Field[] fields = this.getClass().getDeclaredFields();
        //Field[] fields = StaticFieldTest.class.getFields();
        for (Field field : fields){
            System.out.println(field);
        }
    }
}
