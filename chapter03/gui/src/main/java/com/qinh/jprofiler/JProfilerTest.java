package com.qinh.jprofiler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * jprofiler案例测试一
 *
 * @author Qh
 * @version 1.0
 * @date 2021-08-08-11:31
 */
public class JProfilerTest {
    public static void main(String[] args) {
        while (true){
            List<Data> list = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                Data data = new Data();
                list.add(data);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Data{
    private int size = 10;
    private byte[] buffer = new byte[1024 * 1024];
    private String info = "hello,qinhao";
}