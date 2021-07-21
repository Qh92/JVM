package com.qinh;

/**
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:53
 */
public class IHaveNatives {
    public native void Native1(int x);

    public native static long Native2();

    private native synchronized float Native3(Object o);

    native void Native4(int[] ary) throws Exception;

}
