package strings.com;

public class Tochararray 
{
public static void main(String[] args) 
{
	String a = "RohitJadhav";
	char [] b = a.toCharArray();
	
	System.out.println("Chareceter count is "+ a.length());
	
	for (int i =0 ; i<a.length();i++)
	{
		System.out.print(b[i]);
	}
	System.out.println("------");
	
	for (int j=a.length()-1 ; j>=0 ; j--)
	{
		System.out.print(b[j]);
	}
}
}
