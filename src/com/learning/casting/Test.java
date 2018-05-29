package com.learning.casting;

import static java.lang.System.gc;

public class Test {
    public static void main(String[] args) {
        //正常用法
        Cat cat1 = new Cat();
        cat1.run();
        Dog dog1 = new Dog();
        dog1.run();

        //upcasting，子类实例直接赋值给父类（向上类型转换，无须强制）
        Animal cat = new Cat();
        cat.run();
        Animal dog = new Dog();
        dog.run();

        //动态绑定
        Cat cat2  = new Cat();
        Animal a = cat2;
        a.run();
        Dog dog2  = new Dog();
        Animal a1 = dog2;
        a1.run();

        Animal[] as = {a,a1};
        for (int i = 0; i <2 ; i++) {
            Animal ax = as[i];
            ax.run();
        }

        //向下类型转换（需要强制类型转换
        Animal cat3 = new Cat();
        Cat c = (Cat)cat3;
        c.run();

        //向下类型转换可能异常
        Animal cat4 = new Cat();
        Dog dog3 = (Dog) cat4;
        dog3.run();




    }
}

interface Animal{
    public void run();

}

class Dog implements Animal{
    @Override
    public void run() {
        System.out.println("dog run...");
    }
}

class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("cat run...");
    }
}

