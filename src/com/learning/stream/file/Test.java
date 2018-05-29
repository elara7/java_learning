package com.learning.stream.file;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        test1();
        System.out.println("####################");
        test2();
        System.out.println("####################");
        test3();
        System.out.println("####################");
        test5();
        System.out.println("####################");
        test6();
        System.out.println("####################");
        test7();
        System.out.println("####################");
        test4();
        System.out.println("####################");
        test8();
    }

    //遍历目录
    static void test8(){
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/interfaceclass");
        File[] files = f.listFiles();
        for(File f1:files){
            System.out.println(f1.getName());
        }
    }

    //文件测试
    static void test7(){
        File f2 = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/ab.txt");
        System.out.println(f2.canRead());
        System.out.println(f2.isDirectory());
    }

    //重命名
    static void test6(){
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/a.txt");
        File f2 = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/ab.txt");
        boolean b = f.renameTo(f2);
        System.out.println(b);


    }

    //获得文件信息
    static void test5(){
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/javaclass/Test/hello.java");
        String name = f.getName();
        System.out.println("name=" + name);
        String ap = f.getAbsolutePath();
        System.out.println("ap="+ap);

    }

    //删除文件
    static void test4(){
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/ab.txt");
        boolean b =f.delete();
        System.out.println(b);
    }

    //创建目录
    static void test3(){
        //创建单个目录
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/b");
        boolean b = f.mkdir();
        System.out.println(b);

        //连续创建目录（级联）
        f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/b/a/b/c");
        b = f.mkdirs();
        System.out.println(b);
    }

    //创建文件
    static void test2(){
        File f = new File("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/file/a.txt");
        System.out.println(f.exists());
        try {
            boolean b = f.createNewFile();
            System.out.println(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //创建文件对象
    static void test1(){
        String path = "/home/kenn/IdeaProjects/javaLearning/src/com/learning/javaclass/Test/hello.java";
        File f = new File(path);
        //是否存在文件
        boolean b = f.exists();
        System.out.println(b);

        String path1 = "/home/kenn/IdeaProjects/javaLearning/src/com/learning/javaclass/Test/";
        String file1 = "hello.java";
        File f1 = new File(path1, file1);
        b = f1.exists();
        System.out.println(b);
    }
}
