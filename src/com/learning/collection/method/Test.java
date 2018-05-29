package com.learning.collection.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//collection常用接口
public class Test {
    public static void main(String[] args) {

        //新建和增加元素
        Collection<String> c = new ArrayList<String>();
        c.add("A");
        Collection<String> c1 = new ArrayList<String>();
        c1.add("A1");
        c1.add("B1");

        //增加一个集合
        c.addAll(c1);
        System.out.println(c);

        //清空
        //c.clear();
        System.out.println("_________________");
        System.out.println(c);

        //判断是否存在
        boolean b = c.contains("A");
        System.out.println(b);

        //判断是否为空
        b = c.isEmpty();
        System.out.println(b);

        //返回迭代器，collection可以不用迭代器直接遍历，set必须要有迭代器，因为set没索引
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
