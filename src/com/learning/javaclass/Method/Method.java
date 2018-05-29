/**
//static：静态方法，没有则为非静态方法或者实例方法
//静态方法可以通过类名称访问，如Test5.printStart(5)
//非静态方法必须要通过实例访问
**/
package com.learning.javaclass.Method;

public class Method
{
	public static void main(String[] args)
	{
		printStart(100);
		//实例化一个test5
		Method method = new Method();
		//调用ml
		method.ml();
		//调用第二个sum
		int s2 = sum(3,5);
		System.out.println(s2);
		//调用第一个sum
		int s1 = sum();
		System.out.println(s1);
	}
	
	static void printStart(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("*");
		}
	}
	
	void ml()
	{
		System.out.println("ml");
	}
	
	//方法重载overload
	//重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。
	//可以使得同一个函数名可以自动处理不同的输入情况。
	//比如输入参数为空，则调用第一个sum，输入参数为两个整数，则调用第二个sum
	
	static int sum()
	{
		int i = 1;
		int j = 2;
		return i+j;
	}
	
	static int sum(int i, int j)
	{
		return i+j;
	}
}
