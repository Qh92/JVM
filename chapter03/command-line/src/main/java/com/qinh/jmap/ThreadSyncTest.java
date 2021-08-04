package com.qinh.jmap;

/**
 * 线程同步测试
 *
 * @author Qh
 * @version 1.0
 * @date 2021/8/4 17:47
 */
public class ThreadSyncTest {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread thread1 = new Thread(window1);
        Thread thread2 = new Thread(window1);
        Thread thread3 = new Thread(window1);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window1 implements Runnable{

    private int ticket = 600;
    Object object = new Object();
    @Override
    public void run() {
        //Object object = new Object();//多个线程必须要用同一把锁
        while (true){
            synchronized(this){  //this：唯一的Window对象  方式二：synchronized(object)
                if(ticket > 0){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" 卖票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}
