package com.qinh.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * -Xms600m -Xmx600m
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:58
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list = new ArrayList<>();
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(new Picture(new Random().nextInt(1024 * 1024)));
        }
    }
}

class Picture{
    private byte[] pixels;

    public Picture(int length) {
        this.pixels = new byte[length];
    }
}
