package strings.com;

public class CountDupliacateChar {

	public static void main(String[] args) 
	{
		String a = "polymorphism is property in oops concept" ;
		int count = 0;
		
		for (int i=0; i<a.length(); i++)
		{
			if (a.charAt(i)=='p')
			{
				count = count +1;
			}
		}
			System.out.println(count);	
			


	}

}
