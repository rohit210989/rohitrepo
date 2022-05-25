package com.velocity.basics;

public class stringExample 
{
	

public static void main(String[] args) 
{
	
	

String s = "Velocity"; // without new keyword
String v = "Velocity";
String n = "velocity";

String m = new String ("Velocity"); // with new keyword
String l = new String ("Velocity");


boolean result = (s == v); // ADDRESS,  result stored in boolean


	System.out.println(result);
	System.out.println(v ==n); // direct calling the result by comparison
	System.out.println(m==l);
	System.out.println(v==m);

	boolean result2= s.equals(v); // Value Comparison
	
	System.out.println(result2); // Comparing value
	System.out.println(s.equals(m)); // comaring values
	
	String k = "Velocity";
	int lth = k.length();
	System.out.println(lth);
	System.out.println(k.length());
	System.out.println(k.charAt(0));
	System.out.println(k.indexOf('c'));
	System.out.println(k.lastIndexOf('c'));
	System.out.println(k.trim());
	
}
}
