package com.learning.collection.map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

//相当于字典
//hashtable和hashmap的效率差不多，map快一点
//treemap慢一些，需要维护排序
//hashmap是为了快速查询用的
//linkedhashmap比hashmap慢点，需要维护散列数据接口同时维护链表
public class Test {
    public static void main(String[] args) {
        test1();
        System.out.println("________");
        test2();
    }

    static void test1(){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("1","Android");
        hm.put("2","IOS");
        hm.put("3","WP");
        String v1 = hm.get("1");
        System.out.println(v1);

        Set<String> keys = hm.keySet();
        for(String key:keys){
            String value = hm.get(key);
            System.out.println(key+":"+value);

        }
    }

    static void test2(){
        TreeMap<String,String> tm = new TreeMap<String,String>();
        tm.put("1","Android");
        tm.put("2","IOS");
        tm.put("3","WP");

        System.out.println(tm);

    }

}
