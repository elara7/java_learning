package com.learning.interfaceclass;

public class Test {
    public static void main(String[] args) {

        //多个类可以实现同一个接口
        Computer c = new Computer();
        c.read();
        c.write();

        Mobile m = new Mobile();
        m.read();
        m.write();
        //一个类可以实现多个接口
        m.playMP3();

        //多态性，computer实现了usb接口，可以向上类型转化当成USB用
        USB u = new Computer();
        u.read();
        u.write();

        //接口的繼承
        Device d = new Device();
        d.playMP3();
        d.talk();
    }
}

//接口都是抽象類，abstract可以省略
//public也可以省略
//接口里面的所有方法都只有定义，没有实现（抽象类），具体实现方法由实现接口的来具体实现
//接口中的属性默认为public static final
//接口中的方法默认为public abstract

//interface USB{
//
//}
