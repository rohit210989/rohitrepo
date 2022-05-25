package overloadride;

public class ClassOveroad
{
   static void method1(int a) 
   {
	   System.out.println("Rohit");
   }

   static void method1(char b) 
   {
	   System.out.println("Piyu");
   }  
   
   public static void main(String[] args) 
   
   {
	   ClassOveroad.method1(10);
	   ClassOveroad.method1('r');
	   
   }
	
}

