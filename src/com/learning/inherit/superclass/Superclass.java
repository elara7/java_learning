package com.learning.inherit.superclass;

public class Superclass {
    int i=100;

    public Superclass(int i){
        this.i = i;
        System.out.println("SuperClass...iiii");
    }

    public Superclass(){
        System.out.println("SuperClass...");
    }

    public void display(){
        System.out.println("superclass i="+i);
    }
}
