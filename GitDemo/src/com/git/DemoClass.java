package com.git;

public class DemoClass 
{

	public void m1()
	{
		System.out.println("this is m1 method");
	}
	
	public void branch()
	{
		System.out.println("Branching code");
		System.out.println("Main branch");
	}
	
	public void branch2()
	{
		System.out.println("New Branching code");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Git first project");
		DemoClass d=new DemoClass();
		d.m1();
	}
}
