package strings.com;

public class reverse_strings 
{

	public static void main(String[] args)
	{
		String a = "Rohit";
		char [] b = a.toCharArray();
		for(int i=a.length()-1;i>=0; i--)
		{
			System.out.print(b[i]);
		}
		
	}
}
