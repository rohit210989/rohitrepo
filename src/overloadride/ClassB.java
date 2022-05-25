package overloadride;

public class ClassB extends ClassA
{
	
void arithop() 
{
System.out.println("Substraction");

}

public static void main(String[] args)
{

ClassA t = new ClassB();
ClassB t1=new  ClassB();
ClassA t2=new ClassA();
t.arithop();
t1.arithop();
t2.arithop();

}
}

