package com.learning.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        //不用iterator的遍历方法
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("_________________________");

        //使用iterator结合while的遍历方法
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("_________________________");

        //刚生成的iterator默认为空指针
        it = list.iterator();
        //hasnext判断是否有下一个元素
        boolean b = it.hasNext();
        System.out.println(b);

        //调用第一个next后才指向第一个元素
        String e = it.next();
        System.out.println(e);
        e = it.next();
        System.out.println(e);

        //remove的是当前指向的元素，所以如果没有用过next，指向空，使用remove报错
        it.remove();
        System.out.println(list);

    }
}
