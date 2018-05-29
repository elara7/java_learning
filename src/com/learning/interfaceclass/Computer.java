package com.learning.interfaceclass;

//实现接口：implements
//一个类可以实现多种接口
//多个类可以实现同一个接口
//实现接口必须全部接口内方法都实现
public class Computer implements USB {
    @Override
    public void read() {
        System.out.println("read...");
    }

    @Override
    public void write() {
        System.out.println("write...");

    }
}
