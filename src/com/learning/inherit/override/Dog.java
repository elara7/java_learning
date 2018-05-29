package com.learning.inherit.override;

public class Dog extends Animal{
    //override，子类的方法覆盖父类的同名方法
    //子类的访问范围必须大于或者等于父类的访问范围
    //比如父类是public方法，那么子类就只能是public方法
    //父类是protected的，子类可以是public或者protected
    @Override
    public void run() {
        //super是父类引用
        //super.run();
        System.out.println("Dog run...");
    }
}

