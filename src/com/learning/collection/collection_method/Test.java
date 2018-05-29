package com.learning.collection.collection_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(7);
        list.add(9);

        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println("________________");
        System.out.println(list);
        //洗牌
        Collections.shuffle(list);
        System.out.println("________________");
        System.out.println(list);
        //二分查找
        Collections.sort(list);
        int index = Collections.binarySearch(list,3);
        System.out.println(index);

        //最大最小
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("max="+max);
        System.out.println("min="+min);

        //逆序
        Collections.reverse(list);
        System.out.println(list);

        //调换索引2和4的元素
        Collections.swap(list,2,4);
        System.out.println(list);





    }
}
