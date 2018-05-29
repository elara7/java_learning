package com.learning.inherit.override;

public class Test {
    public static void main(String[] args) {
        //子类有自己的同名方法，而不影响父类本身
        //但子类的方法就和父类的不一样了

        Dog dog = new Dog();
        dog.run();
        Animal animal = new Animal();
        animal.run();
    }
}
