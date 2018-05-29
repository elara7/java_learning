package com.learning.stream.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


//将java环境基本数据类型dump到硬盘
public class Test {
    public static void main(String[] args) {
        write();
        read();
    }

    static void write(){
        DataOutputStream dos = null;
        try {
            FileOutputStream fos = new FileOutputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/datastream/a.txt");
            //封装数据流
            dos = new DataOutputStream(fos);
            //按不同类型写入
            dos.writeInt(256);
            dos.writeDouble(Math.PI);
            dos.writeUTF("java");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(dos!=null){
                try {
                    dos.close();
                }catch (Exception e){}
            }
        }
    }

    static void read(){
        DataInputStream dis = null;
        try {
            FileInputStream fis = new FileInputStream("/home/kenn/IdeaProjects/javaLearning/src/com/learning/stream/datastream/a.txt");
            dis = new DataInputStream(fis);
            //顺序按写入顺序，要对应
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(dis!=null){
                try {
                    dis.close();
                }catch (Exception e){}
            }
        }
    }
}
