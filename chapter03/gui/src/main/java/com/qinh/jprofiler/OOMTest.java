package com.qinh.jprofiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * -Xms600m -Xmx600m -XX:SurvivorRatio=8
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/5 10:49
 */
public class OOMTest {
    public static void main(String[] args){
        List<Picture> list = new ArrayList<>();
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(100 * 50)));
        }
    }
}

class Picture{
    private byte[] pixels;
    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
