package com.learning.inherit;

public class Dog2 extends Animal2{

    //构造方法是先执行父类构造方法
    //再执行子类构造方法
    //子类的构造方法中默认自动添加调用父类默认构造方法的代码
    //如果父类没有默认构造方法，必须显示执行父类的构造方法
    public Dog2(){
        super(1,"huahua2",2);
        System.out.println("Dog...");
    }
    void test(){
        //受保护的变量可以在子类中使用
        //私有的则不行
        super.pid = 100;
    }
}
