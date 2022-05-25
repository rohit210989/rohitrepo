package com.velocity.basics;

public class ClassPatterns
{
	public static void main(String[] args) 
	{
		for (int a=0 ; a<=3 ; a++)
		{
			for(int j=0 ; j<=5 ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		
		}
	
	
	for(int a=0 ; a<=4 ; a++) 
	{
	for(int b=0 ; b<=a ; b++) 
	{
		System.out.print("*");
	}

		System.out.println("");
	}
	
	for(int a=0 ; a<=4 ; a++) 
	{
	for(int b=0 ; b<=4-a ; b++) 
	{
		System.out.print("*");
	}

		System.out.println("");
	
	}
	
	for(int a=0 ; a<=4 ; a++) 
	{
		for(int c=0 ; c<=3-a ; c++)
		{
			
			System.out.print(" ");
		}
	for(int b=0 ; b<=a ; b++) 
	{
		System.out.print("*");
	}

		System.out.println("");
	
	}
	
	//pattern5
	
	for(int a=0 ; a<=4 ; a++) 
	{
		for(int c=0 ; c<a ; c++)
		{
			
			System.out.print(" ");
		}
	for(int b=4 ; b>=a ; b--) 
	{
		System.out.print("*");
	}

		System.out.println("");
	
	}
	
	
	}
}
