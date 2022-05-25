package com.velocity.basics;

public class Constructor 
{

	int a ;
	int b ;
	int c ;
	int x ;
	int y;
	int z;
	
	static int p=20;
	static int q=45;
	static int r=q/p;
	
	Constructor(char a , int b)
	{
		System.out.println(r);
	}
	Constructor ()
	{
		a=5;
		b=6;
		c=8;
	}
	
	Constructor(int a,char b)
	{
	
	x = 5;
	y = 6 ;
	z=x*y;
	}
	
	public static void main(String[] args) 
	{
		new Constructor('h',89); // Constructor calling for static variables , using new
		Constructor  b = new Constructor(); //object creation for non static elements
				
	System.out.println(b.a+ b.b+ b.c);	
	Constructor  c = new Constructor( 4 , 'r'); 
	System.out.println(c.z);	
	
	}
}
