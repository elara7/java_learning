package com.learning.stream.printstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;


//打印流
//将print的东西输出到文件
public class Test {
    public static void main(String[] args) {
        test1();
    }

    static void test1(){
        String path = "/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/printstream/a.txt";
        try {
            PrintStream ps = new PrintStream((OutputStream)(new FileOutputStream(path)));
            //将print重定向到打印流
            System.setOut(ps);

        } catch (Exception e){
            e.printStackTrace();
        }




        int num = 0;
        for (int i = 0; i <65535 ; i++) {
            System.out.println((char)i);
            num++;
            if(num==100){
                System.out.println();
                num = 0;
            }

        }
    }
}
