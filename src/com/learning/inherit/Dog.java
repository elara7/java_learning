package com.learning.inherit;

public class Dog extends Animal{

    //构造方法是先执行父类构造方法
    //再执行子类构造方法
    //子类的构造方法中默认自动添加调用父类默认构造方法的代码
    public Dog(){
        System.out.println("Dog...");
    }
    void test(){
        //受保护的变量可以在子类中使用
        //私有的则不行
        super.pid = 100;
    }
}
