package com.learning.thread.manager;

public class Test {
    public static void main(String[] args) {
        //新建线程的时候可以指定名字
        Runnable r = new MyThread();

        Thread t1  = new Thread(r,"T1");
        Thread t2  = new Thread(r,"T2");
        //感觉优先级没啥用
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

        //join,会等待join前的所有线程执行完毕后再往下进行
        try {
            t1.join();
            t2.join();
        } catch (Exception e){
            e.printStackTrace();
        }


        //主线程
        for (int i = 1; i <=10 ; i++) {
            System.out.println(Thread.currentThread().getName()+", i="+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+", i="+i);
            try {
                Thread.sleep(10);
            } catch (Exception e){
                e.printStackTrace();
            }
            if(i%10 == 0){
                //让位给其他线程,暂停本线程cpu，让给其他线程
                Thread.yield();
            }
        }
    }
}