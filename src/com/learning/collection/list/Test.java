package com.learning.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

//list继承与collection
//根据进入的先后顺序生成索引
//允许重复值（不同先后进入有不同索引），不会重新排序
//是一个接口
//可变长度

//arraylist是一个list的实现类
//通过数组实现
//读取快，插入和删除慢（数据要再分配），适合随机访问

//linkedlist也是一个list实现类，类似链表
//根据节点在链的部位，由前后开始查找元素
//删除和插入快，读取速度慢
//适合插入删除

//Vector一般不同，只用来兼容老代码。速度一般不如arraylist

//通常用ArrayList做首选，只有程序性能因为经常需要插入和删除而变差，才用LInkedList
//如果是固定数量的元素，就直接用数组

public class Test {
    public static void main(String[] args) {
        testLinkedList();
        System.out.println("______________");
        testArrayList();
    }

    static void testLinkedList(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.addFirst("A0");
        ll.addLast("D");
        System.out.println(ll);
        String f = ll.getFirst();
        System.out.println(f);
        String l = ll.getLast();
        System.out.println(l);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);


    }

    static void testArrayList(){
        ArrayList<String> al = new ArrayList<String>();
        al.add(0,"A");
        al.add("B");
        al.add("C");
        String e = al.get(0);
        System.out.println(e);

        int index = al.indexOf("A");
        System.out.println(index);
    }


}
