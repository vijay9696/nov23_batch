package corejava;

class Addition
{
	int a=10;
	int b=20;
	
	static int a1=30;
	static int b1=20;
	
	//instance---object
	public void add()
	{
		int addition=a+b;
		System.out.println("Addition:"+addition);
	}
	
	//static---class
	public static void add1()
	{
		int addition=a1+b1;
		System.out.println("Addition:"+addition);
	}
}

public class InstanceAndStaticMethodsInJava 
{

	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.add();
		Addition.add1();
	}

}
