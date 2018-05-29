package com.learning.javaclass.Static;

public class Static2
{
	public static void main(String[] args)
	{
		//单例：一个类只能产生一个对象（实例）
		//因为构造方法是私有的，不能直接new
		//Demo d = new Demo();
		//测试
		Demo d1 = Demo.getInstance();
		Demo d2 = Demo.getInstance();
		System.out.println(d1==d2);
	}
}

class Demo
{
	//单例条件1：构造方法是私有的，不能被类外被调用（不能直接new）
	private Demo()
	{
	}
	//单利条件2：提供一个私有的静态实例，静态实例对一个类来说是所有对象共享的，即只有这个实例
	private static Demo instance;
	//单例条件3：提供一个静态的公共的访问方法
	public static Demo getInstance()
	{
		if(instance==null)
		{
			//如果没有实例(instance这个实例为空），自己实例化自己
			instance = new Demo();
		}
		return instance;
	}
	
}