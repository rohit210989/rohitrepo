package com.velocity.basics;

public class ImplicitExplicit 
{

	public static void main(String[] args) 
	{
		int a= 10;
		float b = a;  
		
		// double > long > float > int > short > byte
		
		System.out.println(b ); // implicit casting // widening
		
		short c = 129;
		byte d = (byte) c; // Explicit
		
		System.out.println(d);
		
	}
}
