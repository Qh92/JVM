package com.qinh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 指令8：异常处理
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/30 11:07
 */
public class ExceptionTest {
    public void throwZero(int i){
        if(i == 0){
            throw new RuntimeException("参数值为0");
        }
    }
    public void throwOne(int i) throws RuntimeException, IOException {
        if(i == 1){
            throw new RuntimeException("参数值为1");
        }
    }
    public void throwArithmetic() {
        int i = 10;
        int j = i / 0;
        System.out.println(j);
    }

    public void tryCatch(){
        try{
            File file = new File("d:/hello.txt");
            FileInputStream fis = new FileInputStream(file);

            String info = "hello!";
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    //思考：如下方法返回结果为多少？
    public static String func() {
        String str = "hello";
        try{
            return str;
        }
        finally{
            str = "atguigu";
        }
    }

    /**
     *  0 iconst_0 将0压入操作数栈中
     *  1 istore_0 将0存入局部变量表第0个位置
     *  2 iinc 0 by 1 局部变量表的第0个位置的数自增1
     *  5 iload_0 将局部变量表的第0个位置的数压入操作数栈中
     *  6 istore_1 将操作数栈中的数存入局部变量表的第1个位置
     *  7 iinc 0 by 1 局部变量表的第0个位置的数自增1（现在数值为2）
     * 10 iload_1 将局部变量表的第1个位置的数压入操作数栈中
     * 11 ireturn 最后将这个值返回 最终返回值为1
     * 12 astore_2
     * 13 iinc 0 by 1
     * 16 aload_2
     * 17 athrow
     * @return
     */
    public static int func2(){
        int i = 0;
        try {
            return ++i;
        }finally {
            ++i;
        }
    }

    /**
     * 0 iconst_0
     *  1 istore_0
     *  2 iinc 0 by 1
     *  5 iinc 0 by 1
     *  8 iconst_0
     *  9 istore_1
     * 10 iinc 1 by 1
     * 13 iinc 1 by 1
     * 16 return
     */
    public static void func3() {
        int i = 0;
        i++;
        i++;
        int j = 0;
        j++;
        j++;
    }

    public static void main(String[] args) {

        System.out.println(func());//hello
        System.out.println(func2());//0
    }
}
