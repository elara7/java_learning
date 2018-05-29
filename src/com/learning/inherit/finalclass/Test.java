package com.learning.inherit.finalclass;

public class Test {
    public static void main(String[] args) {

    }
}

//final方法无法重写override
//final变量无法被重新赋值（变成常量）
class A {
    final void m(){}

    final double PI = 3.14;

}

//final类无法被继承
final class Finalclass{

}

