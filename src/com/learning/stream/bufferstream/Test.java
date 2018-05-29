package com.learning.stream.bufferstream;

import java.io.*;


//缓冲流：
//批量读取和写入内容
//实际上就是把文件流封装成缓冲流
//再用缓冲流读写

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    //缓冲字符输入流
    static void test4(){
        try {
            Reader in = new FileReader("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/bufferstream/tmp2.txt");
            BufferedReader br = new BufferedReader(in);
            String s = null;
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //缓冲字符输出流
    static void test3(){
        try {
            Writer w = new FileWriter("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/bufferstream/tmp2.txt");
            BufferedWriter bw = new BufferedWriter(w);
            String str = "任天堂Nintendo";
            bw.write(str);
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //缓冲字节输入流
    static void test2(){
        try {
            InputStream in = new FileInputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/bufferstream/tmp.txt");
            BufferedInputStream bis = new BufferedInputStream(in);
            //一次性获得文件所有大小，以此创建数组
            byte[] b = new byte[in.available()];
            //bis的东西一次性读取入b
            bis.read(b);
            bis.close();
            in.close();
            //将b转化为string，一次性打印
            System.out.println(new String(b));
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //缓冲字节输出流
    static void test1(){
        try {
            OutputStream out = new FileOutputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/bufferstream/tmp.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out);
            String str = "elara15598";
            byte[] buffer = str.getBytes();
            bos.write(buffer);
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
