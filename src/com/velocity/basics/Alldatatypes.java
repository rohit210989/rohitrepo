package com.velocity.basics;

public class Alldatatypes  // Variable is a piece of memory used to store information at a time
{
static short a;  // Global variable declaration using variable type as static at class level
static int b;
static long c;
static double d;
static char e;
static boolean f;
static float g;
static String h;

public static void main(String[] args) // execution start from main method
{
System.out.println(a);	// printing statement of all default values
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);


int a1= 10;    // local variable declaration inside the main method
double b1= 15.6;  // int is data type, b1 is variable , 15.6 is initialization value
float c1=0.5f;
String d1="Rohit";
char e1='j';
boolean f1=true;

System.out.println(a1);
System.out.println(b1);
System.out.println(c1);
System.out.println(d1);
System.out.println(e1);
System.out.println(f1);

}


}
