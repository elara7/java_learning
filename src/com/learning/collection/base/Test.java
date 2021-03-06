package com.learning.collection.base;

import java.util.ArrayList;
import java.util.List;

public class Test {
    //定义一个集合list，里面的元素都是String
    static List<String> list;
    public static void main(String[] args) {
        list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        iterate();
        System.out.println("__________________");
        remove("A");
        iterate();
        System.out.println("__________________");
        find("C");
        find("E");
    }
    //添加
    static void add(String e){
        list.add(e);
    }
    //删除
    static void remove(String e){
        list.remove(e);
    }
    //find
    static void find(String e){
        boolean b = false;
        for(String s : list){
            if(s.equals(e)){
                System.out.println("found!");
                b = true;
                return;
            }
        }
        if(!b){
            System.out.println("not found!");
        }
    }
    //遍历
    static void iterate(){
        for(String s : list){
            System.out.println(s);
        }
    }
}
