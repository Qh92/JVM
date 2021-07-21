package com.qinh.java2;

/**
 * 体会invokedynamic指令
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:45
 */
@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void lambda(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();

        Func func = s -> {
            return true;
        };

        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });
    }
}
