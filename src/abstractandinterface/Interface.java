package abstractandinterface;

public interface Interface

{
 int  a=10; // public static and final
 
 void method1(); // abstract method 1 public and abstract
 void method2();   // public and abstract
 
 static void method3() // Static method of interface
 {
	 System.out.println("this is static method of interface");
 }
 
 default void method4() // Default method of interface 
 {
	 System.out.println("This is defauls method of Interface");
 }
 
}
