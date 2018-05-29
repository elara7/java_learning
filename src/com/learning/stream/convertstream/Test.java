package com.learning.stream.convertstream;


import java.io.*;

public class Test {
    public static void main(String[] args) {
        test1();
        test2();
    }

    //字节输出流到字符输出流
    static void test1(){
        try {
            String path = "/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/convertstream/tmp.txt";
            //outputstreamwriter把字节输出流转化为字符输出流
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            String str = "任天堂Nintendo";
            out.write(str);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字节输入流到字符输入流
    static void test2(){
        boolean flag = true;
        System.out.println("输入bye退出程序");


        while (flag){
            //System.in：从键盘输入字节
            //转为字符缓存
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = br.readLine();
                if(!str.equals("bye")){
                    System.out.println(str);
                }else{
                    flag=false;
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
