package com.qinh;

import org.junit.Test;

/**
 * 指令2：算术指令
 *
 * @author Qh
 * @version 1.0
 * @date 2021/7/27 15:54
 */
public class ArithmeticTest {
    @Test
    public void method1(){
        int i = 10;
        double j = i / 0.0;
        System.out.println(j);//无穷大


        double d1 = 0.0;
        double d2 = d1 / 0.0;
        System.out.println(d2);//NaN: not a number
    }

    public void method2(){
        float i = 10;
        float j = -i;
        i = -j;
    }

    public void method3(int j){
        int i = 100;
//        i = i + 10;
        i += 10;
    }
    public int method4(){
        int a = 80;
        int b = 7;
        int c = 10;
        return (a + b) * c;
    }

    public int method5(int i ,int j){
        return ((i + j - 1) & ~(j - 1));
    }

    //关于(前)++和(后)++
    //不涉及运算，前++和后++没有区别
    public void method6(){
        int i = 10;
        i++;
        //++i;

//        for(int j = 0;j < 10;j++){}
    }
    public void method7(){
        int i = 10;
        int a = i++;

        int j = 20;
        int b = ++j;
    }
    //思考
    /**
     *  0 bipush 10 将10压入操作数栈顶
     *  2 istore_1  弹出操作数栈顶位置的10，并将10存入局部变量表中角标为1的位置
     *  3 iload_1   取出局部变量表中角标为1的数据，压入操作数栈顶
     *  4 iinc 1 by 1 将局部变量表中角标为1的数据自增1
     *  7 istore_1   弹出操作数栈顶的10，存入局部变量表中角标为1的位置
     *  8 getstatic #2 <java/lang/System.out>
     * 11 iload_1
     * 12 invokevirtual #5 <java/io/PrintStream.println>
     * 15 return
     */
    public void method8(){
        int i = 10;
        i = i++;
        System.out.println(i);//10
    }

    /**
     *  0 bipush 10 将10压入操作数栈顶
     *  2 istore_1 弹出操作数栈顶位置的10，并将10存入局部变量表中角标为1的位置
     *  3 iinc 1 by 1 将局部变量表中角标为1的数据自增1
     *  6 iload_1  取出局部表中角标为1的数据并压入操作数栈顶
     *  7 istore_1 将操作数栈顶的数据弹出并存入局部变量表中角标为1的位置
     *  8 getstatic #2 <java/lang/System.out>
     * 11 iload_1
     * 12 invokevirtual #5 <java/io/PrintStream.println>
     * 15 return
     */
    @Test
    public void method9(){
        int i = 10;
        i = ++i;
        System.out.println(i);//11
    }
}
