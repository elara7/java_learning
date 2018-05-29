package com.learning.thread.createthread;

public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        //不是直接调用run方法，直接调用的话就变成方法调用了。start才是开线程跑run
        t.start();

        //实现runable接口后的MyThread2类并不是Thread类，只是有了run方法
        //所以还需要将其转化为Thread类，Thread构造方法中可以传递一个runable接口实现类，完成向上类型转化
        Thread t2 =  new Thread(new MyThread2());
        t2.start();
    }
}

//通过继承Thread类来创建线程
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//通过实现runable接口，这种比较灵活，可以继承自其他类，前一种方法必须继承Thread类
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            if(i>=6){
                //使用break或者return退出线程，退出后则不能再次启动
                break;
            }
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}