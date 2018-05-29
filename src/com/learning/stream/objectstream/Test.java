package com.learning.stream.objectstream;

import java.io.*;


//将一个java类dump到硬盘

public class Test {
    public static void main(String[] args) {
        write();
        read();
    }

    static void write(){
        Employee ee = new Employee();
        try {
            FileOutputStream fos = new FileOutputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/objectstream/a.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ee);
            oos.flush();
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static void read(){
        try {
            FileInputStream fis = new FileInputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/objectstream/a.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee er = (Employee)ois.readObject();
            System.out.println("age = " + er.age + ", id = " + er.id + ", salary = " + er.salary + ", cardNum = " + er.cardNum);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

//需要被dump的类需要实现Serializable接口
class Employee implements Serializable{
    int id = 10;
    int age =20;
    double salary = 3500;
    //不想被dump的变量用transient标记
    transient String cardNum = "123456789";
}
