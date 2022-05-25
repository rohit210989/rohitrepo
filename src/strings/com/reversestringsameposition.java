package strings.com;

public class reversestringsameposition
{
public static void main(String[] args)
{
	String a= "my name is Rohit";
	 
	 String [] b= a.split(" ");
	 String c = "";
	 
	 for (int i=0; i<=b.length; i++)
	 {
		 if (i<b.length)
		 {
			 c= " "+b[i]+c;
		 }
		 
	 }
	 System.out.println(c);

}
}
