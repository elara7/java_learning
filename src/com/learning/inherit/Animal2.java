package com.learning.inherit;

public class Animal2 {
    private int aid;
    private String name;
    private int age;

    protected int pid;

    //无默认构造方法
    public Animal2(int aid, String name, int age){
        System.out.println("Animal2");
        this.aid = aid;
        this.name = name;
        this.age = age;
    }


    //右键生成，可以自动得到所有变量的get和set方法
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        String msg = "" + aid + "," + name + "," + age;
        System.out.println(msg);
    }
}
