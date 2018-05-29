package com.learning.inherit.objectclass;

public class Test {
    public static void main(String[] args) {
        Person per = new Person(1,"tom");
        //默认输出类路径和hash值
        //重写toString可以改成自己想要的输出
        String str = per.toString();
        System.out.println(str);

        Person per2 = new Person(1,"tom");
        //比较两个对象的指针
        System.out.println(per == per2);
        //equals比较两个对象，默认底层也是比较指针
        //重写后，首先强制类型转换，然后对比内容是否相同
        boolean r = per.equals(per2);
        System.out.println(r);

        //获得自描述类，即当前类的信息
        Class cls = per.getClass();

        //当对象不在被引用则会被gc回收
        //类置为空则不被引用
        per = null;
        per2 = null;

        System.gc();
    }
}

class Person{
    //没有再被引用的话，自动释放资源
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize...");
    }

    @Override
    public String toString() {
        return pid + "," + name;
    }

    @Override
    public boolean equals(Object o) {
        Person per = (Person)o;
        //string类型的equals已经做了内容对比重写，可以直接用
        return (this.pid == per.pid && this.name.equals(per.name));
    }

    //创建类的原则：私有的属性，公共的方法

    private int pid;
    private String name;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    public Person() {
    }
}