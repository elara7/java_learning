package com.learning.interfaceclass.insiderclass;

public class Test {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        //实例化方法
        OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();

        OuterClass.InnerClass ic = oc.new InnerClass();

        //匿名内部类，可以用来实例化接口
        USB usb = new USB(){
            @Override
            public void read() {

            }

            @Override
            public void write() {

            }
        };

        //匿名内部类，可以用来实例化抽象类
        Animal a = new Animal() {
            @Override
            void run() {
                System.out.println("run...");
            }
        };

        a.run();
    }
}

abstract class Animal{
    abstract void run();
}

interface USB{
    public void read();
    public void write();
}