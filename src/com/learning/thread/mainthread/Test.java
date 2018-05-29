package com.learning.thread.mainthread;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        //如果直接运行loop，会阻塞，因为默认只有一个主线程，需要等loop执行完才打印end
        //loop();

        //如果另外启动一个线程来执行loop，则会同时有2个线程来运行，后面的代码会直接执行
        new Thread(){
            @Override
            public void run() {
                loop();
            }
        }.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("end...");
    }

    static void loop(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <=10 ; i++) {
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
