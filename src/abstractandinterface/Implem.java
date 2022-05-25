package abstractandinterface;

public class Implem implements Interface
{

	

	public void method1()
	{
		System.out.println("this is method 1");
	}
	
	public void method2()
	{
		System.out.println("This is method 2");
	}
	
	
	public static void main(String[] args) 
	{
		Implem t1 = new Implem(); // object creation
		t1.method1(); // non static method calling
		t1.method2(); // non static method calling
		
		System.out.println(a);
		
		
				t1.method4();
	}


	

}
