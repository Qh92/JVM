package com.qinh;

import org.junit.Test;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-06-14-0:42
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println(t1());
    }

    public static int t1(){
        int i = 0;
        try {
            return ++i;
        }finally {
             ++i;
        }
    }

    @Test
    public void t2(){
        String dirs = System.getProperty("java.ext.dirs");
        //System.out.println(dirs);
        for (String path : dirs.split(";")){
            System.out.println(path);
        }
        System.out.println();

        String javaDirs = System.getProperty("java.class.path");
        //System.out.println(javaDirs);
        for (String path : javaDirs.split(";")){
            System.out.println(path);
        }
    }
}
