package com.learning.stream.filestream;


import java.io.*;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    //文件字符输出流
    static void test4(){
        try {
            FileReader in = new FileReader("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/filestream/tmp2.txt");
            int a;
            while ((a=in.read()) != -1){
                System.out.println((char)a);
            }
            in.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //文件字符输入流
    static void test3(){
        try {
            FileWriter out = new FileWriter("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/filestream/tmp2.txt");
            String str = "任天堂Nintendo";
            out.write(str);
            out.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //文件字节输入流
    static void test2(){
        try {
            FileInputStream in = new FileInputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/tmp.txt");
            int a;
            while((a=in.read()) != -1){
                System.out.println((char)a);
            }
            in.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //文件字节输出流
    static void test1(){
        try {
            FileOutputStream out = new FileOutputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/tmp.txt");
            String str = "elara15598";
            byte[] buffer = str.getBytes();
            out.write(buffer);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
