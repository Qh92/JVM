package com.qinh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-07-12-0:12
 */
public class GCRootsTest {

    public static void main(String[] args) {
        List<Object> numList = new ArrayList<>();

        Date birth = new Date();

        for (int i = 0; i < 100; i++) {
            numList.add(String.valueOf(i));
            try {
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("数据添加完毕，请操作:");
        new Scanner(System.in).next();
        numList = null;
        birth = null;
        System.out.println("numList、birth已置空，请操作:");
        new Scanner(System.in).next();
        System.out.println("结束");
    }
}
