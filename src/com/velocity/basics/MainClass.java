package com.velocity.basics;

public class MainClass 
{

	public static void main(String[] args)
	{
		SuperClass1 t = new SuperClass1();
		t.xyx();
		SuperClass1.abc();
		
		SubClass1 t1 = new SubClass1();
		t1.xyx();
		SubClass1.abc();
		
		System.out.println("-------------------------------");
		
		SuperClass1 p = new SubClass1();
		SuperClass1.abc();
		p.xyx();
		
		
				
	}
}

