package strings.com;

public class StringPalindrome
{
public static void main(String[] args)
{
	String a = "RADAR";
	String b ="";
	char [] c=a.toCharArray();
	
	for(int i=a.length()-1;i>=0;i--)
	{
		b=b + c[i];
	}
	
	if(a.equals(b)==true) 
	{
		System.out.println( a + " is string palindrome");
	}
	else 
	{
		System.out.println(a + " is not string palindrome");
	}

}

}
