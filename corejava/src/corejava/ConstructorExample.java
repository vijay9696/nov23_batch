package corejava;

public class ConstructorExample 
{
	int a=33;
	int b=44;
	public ConstructorExample()
	{
		a=10;
		b=20;
	}
	
	public static void main(String args[])
	{
		ConstructorExample obj=new ConstructorExample();
		System.out.println("a:"+obj.a);
		System.out.println("b:"+obj.b);
	}
}
