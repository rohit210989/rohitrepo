package encapsulation;

public class DemoClass
{

	private int a = 10;
	private int b=20;
	private int c;
	
	private String s = "Rohitlogin";
	private String m = "Rohit@123";
	
	
	public void demo() 
	{
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
		
	public void demo2()
	{
		System.out.println(s);
		System.out.println(m);
	}
}
