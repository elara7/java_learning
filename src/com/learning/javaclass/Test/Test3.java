package com.learning.javaclass.Test;

public class Test3
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		Bike b = new Bike();
		Person tom = new Person();
		tom.pid = 1;
		tom.name = "tom";
		tom.age = 20;
		tom.display();

		Person kite = new Person();
		kite.pid = 2;
		kite.name = "kite";
		kite.age = 21;
		kite.display();

		Person rose = new Person();
		rose.pid = 3;
		rose.name = "rose";
		rose.age = 22;
		rose.display();

		tom.ride(b);
	}
}

//聚合关系，CPU，ROM可以单独存在，组合成计算机
//合成关系：手臂不能单独存在，手臂组成人
//依赖关系：一个类的定义取决于另一个类。

class CPU
{
}

class ROM
{
}

class Computer
{
	CPU cpu;
	ROM rom;
}


class Car
{
}

class Driver
{
}

class Bike
{
	public void run()
	{
		System.out.println("bike is running");
	}
}

class Person
{
	public int pid;
	public String name;
	public int age;

	Person()
	{

	}

	void display()
	{
		String msg = pid + "," + name + "." + age;
		System.out.println(msg);
	}

	public void ride(Bike b)
	{
		b.run();
	}
}


