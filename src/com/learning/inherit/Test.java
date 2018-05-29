//继承关系：xxx 是 xxx 的一种
//组合关系：xxx 是 xxx 的一部分（电脑和cpu）

package com.learning.inherit;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //直接继承Animal的方法
        dog.setAid(1);
        dog.setName("huahua");
        dog.setAge(2);

        dog.display();

        Dog2 dog2 = new Dog2();

        //直接继承Animal的方法
        dog2.setAid(1);
        dog2.setName("huahua2");
        dog2.setAge(2);

        dog2.display();
    }
}
