package com.learning.javaclass.Constructor;


public class Constructor
{
	public static void main(String[] args)
	{
		//实例化的过程就是调用了类中的语句，然后执行构造方法
		//调用无参构造方法（系统会默认提供一个）
		Person per = new Person();
		per.display();
		
		Person per2 = new Person(2,"tom",10);
		per2.display();
	}
}

class Person
{
	//构造方法，初始化Person类的实例，赋予初值
	//根据不同的输入，构成方法重载
	//没有写void也没有其他输出，且方法名和类名相同，则为构造方法
	//如果有用户定义的构造方法，则系统默认的无参数构造方法不再提供
	//如果需要无参数构造方法就必须手动增加一个
	//可以在一个构造方法中构造另一个构造方法
	public Person()
	{
		System.out.println("Person");
		pid = 1;
		name = "无名氏";
		age = 0;
	}
	
	public Person(int pid,String name,int age)
	{
		this.pid  = pid;
		this.name  = name;
		this.age = age;
	}
	
	//实例化的时候先调用了以下外层代码，再调用构造方法
	//初始化变量类别
	int pid;
	String name;
	int age;
	
	void display()
	{
		//""避免pid+','合并为一个数
		String msg = "" + pid + ',' + name + ',' + age;
		System.out.println(msg);
	}
}