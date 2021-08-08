package com.qinh.jprofiler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 内存泄漏问题
 *
 * @author Qh
 * @version 1.0
 * @date 2021-08-08-15:38
 */
public class MemoryLeak {

    public static void main(String[] args) {
        while (true){
            List<Bean> beanList = new ArrayList<>();
            for (int i = 0; i < 500; i++) {
                Bean bean = new Bean();
                bean.list.add(new byte[1024 * 10]);
                beanList.add(bean);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Bean{
    int size = 10;
    String info = "hello,qinh";
    static ArrayList list = new ArrayList<>();
}
