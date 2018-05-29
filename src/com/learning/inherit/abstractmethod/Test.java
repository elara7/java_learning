package com.learning.inherit.abstractmethod;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        Dog dog = new Dog();
        dog.run();

    }
}


//抽象类
//不能private
//不能static
//不能final（final表示不能被重写）
//不能实例化
//只能用作超类
//子类要么覆盖并实现抽象方法，要么本身也是抽象类
abstract  class Animal
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();
    //不能加{}，这样叫做空实现，不是无实现。


}

//抽象类一般用来被继承，实现多态
//即同名方法在不同子类下有不同实现
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("Dog run...");
    }
}

class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("Cat run...");
    }
}