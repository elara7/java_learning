package com.learning.inherit.superclass;

public class Subclass extends Superclass{
    int i=10;
    //super可以表示父类的构造方法
    public Subclass(){
        super();
        System.out.println("Subclass...");
    }

    public Subclass(int i){
        //调用父类构造方法的时候会自动选择合适的
        super(i);
        System.out.println("Subclass...iiii");
    }

    public void display(){
        super.display();
        System.out.println("subclass i="+i);
        System.out.println("superclass i="+super.i);
    }

    public void test(){
        this.display();
        super.display();
    }

}
