package com.velocity.basics;

public class Factorial {

	public static void main(String[] args) 
	{
		int i, x= 1;
		
		int num = 3;
		
		for (i=1; i<=num ; i++)
		{
			x=x*i;
		}
		
		System.out.println("Factorial of number " + x);
	}
}
