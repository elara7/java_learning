package com.learning.javaclass.Static;

public class Static
{
	public static void main(String[] args)
	{
		Person per1 = new Person();
		System.out.println("" + per1.pid + ',' + per1.age);
		
		Person per2 = new Person();
		System.out.println("" + per2.pid + ',' + per2.age);
	}
}

class Person
{
	//static 声明后，则对所有同类实例，pid只有一个，任何实例中的操作都会改变pid，所有对象共享
	static int pid;
	int age;
	public Person()
	{
		pid++;
		age++;
	}
	
	//static 方法可以直接用类名.方法直接调用
	//非static方法需要实例化后，由实例.方法来调用
	
	static void m1()
	{
		//static方法不能直接调用（访问）非静态的变量和方法
		//age = 100; 编译出错
		//m2(); 编译出错
		//this; 编译出错
		//this.age; 编译出错
		//this.m2(); 编译出错
	}
	
	void m2()
	{
	}
	
}
