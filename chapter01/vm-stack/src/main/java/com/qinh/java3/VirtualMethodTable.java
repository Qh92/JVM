package com.qinh.java3;

/**
 * 虚方法表的举例
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-27-22:48
 */
interface Friendly {
    void sayHello();
    void sayGoodbye();
}
class Dog {
    public void sayHello() {
    }
    @Override
    public String toString() {
        return "Dog";
    }
}
class Cat implements Friendly {
    public void eat() {
    }
    @Override
    public void sayHello() {
    }
    @Override
    public void sayGoodbye() {
    }
    @Override
    protected void finalize() {
    }
    @Override
    public String toString(){
        return "Cat";
    }
}

class CockerSpaniel extends Dog implements Friendly {
    @Override
    public void sayHello() {
        super.sayHello();
    }
    @Override
    public void sayGoodbye() {
    }
}

public class VirtualMethodTable {
}
