package com.learning.interfaceclass.insiderclass;

public class OuterClass {
    //內部類是一種嵌套關系，在類的內部定義類
    //实例内部类
    class InnerClass{

    }

    //静态内部类
    static class StaticInnerClass {
    }


    //局部内部类
    void test() {
        class localClass {

        }
    }
}

