package com.learning.collection.set;

//set继承collection
//不允许重复
//内部排列机制，和加入顺序不同
//是一个接口

//HashSet是最常用的Set实现
//查询速度最快，以HashMap实现
//不能保持插入顺序

//TreeSet也是一种Set实现
//总是处于排序状态
//唯一一个实现了SortedSet接口的实现
//以TreeMap实现

//除非集合需要排序，否则hashset性能更好
//linkedhashset的遍历比hashset快，但是插入慢一些

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //hashset
        test1();
        System.out.println("_____________");
        //hashset加入自己定义的类（未覆盖hashcode和equals)
        test2();
        System.out.println("_____________");
        //hashset加入自己定义的类（覆盖hashcode和equals)
        test3();
        System.out.println("_____________");
        //treeset
        test4();
        System.out.println("_____________");
        //treeset加入自己定义的类
        test5();


    }

    static void test5(){
        TreeSet<Person2> ts = new TreeSet<Person2>();
        Person2 per = new Person2(1,"tom",20);
        Person2 per2 = new Person2(3,"rose",19);
        Person2 per3 = new Person2(2,"kite",21);

        ts.add(per);
        ts.add(per2);
        ts.add(per3);

        System.out.println(ts);

    }

    static void test4(){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("E");
        ts.add("D");
        ts.add("C");
        ts.add("B");
        System.out.println(ts);
    }

    static void test3(){
        //把自己定义的类添加入set的时候需要覆盖原有的hashcode和equals方法
        //否则2个一样的类会被判断为不同的类，都加入进去
        HashSet<Person2> hs = new HashSet<Person2>();
        Person2 per = new Person2(1,"tom",20);
        hs.add(per);
        Person2 per2 = new Person2(1,"tom",21);
        hs.add(per2);
        Person2 per3 = new Person2(2,"kite",19);
        hs.add(per3);
        System.out.println(hs);
    }

    static void test2(){
        //把自己定义的类添加入set的时候需要覆盖原有的hashcode和equals方法
        //否则2个一样的类会被判断为不同的类，都加入进去
        HashSet<Person> hs = new HashSet<Person>();
        Person per = new Person(1,"tom",20);
        hs.add(per);
        Person per2 = new Person(1,"tom",20);
        hs.add(per2);
        System.out.println(hs);
    }

    static void test1(){
        HashSet<String> hs = new HashSet<String>();
        //不能重复，添加2次A最后集合中只有一个A
        hs.add("A");
        hs.add("A");
        hs.add("B");
        System.out.println(hs);
    }
}

class Person{
    private int pid;
    private String name;
    private int age;

    @Override
    public String toString() {
        return pid + "," + name +"," + age;
    }

    public Person(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
}

class Person2 implements Comparable{
    private int pid;
    private String name;
    private int age;


//    @Override
//    public int hashCode() {
//        return 1;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        Person2 per = (Person2)o;
//        return this.pid == per.pid;
//    }

    //只比较pid
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person2 person2 = (Person2) o;
//        return pid == person2.pid;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(pid);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return pid == person2.pid &&
                age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pid, name, age);
    }

    @Override
    public int compareTo(Object o) {
        Person2 per = (Person2)o;
        return this.age < per.age ? -1:(this.age==per.age?0:1);
    }

    @Override
    public String toString() {
        return pid + "," + name +"," + age;
    }

    public Person2(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    public Person2() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
}