package com.velocity.basics;

public class ReturnTypes
{

	public static int xyz() 
	{
		int a = 10;
		int b = 15;
		int c = a+b;
		
		return c;
		
	}
	
	public static String abcs()
	{
		String c = "Rohit";
		
		return c; 
	}
	
	public static char abcd()
	{
		char a1 = 'q';
		return a1;
		
	}
	
	public static void main(String[] args) 
	{
		int s = xyz(); // We have to strore the return value in data type
		System.out.println(s);
		
		String p = abcs(); // We have to store the return value in data type
		System.out.println(p);
		
		char o = abcd();
		System.out.println(o);
	}
	
}
