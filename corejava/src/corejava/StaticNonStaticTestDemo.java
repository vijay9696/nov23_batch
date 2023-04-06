package corejava;

class Test1
{
	void m1()//instance method---class object
	{
		m2();
		m3();
		m4();
		System.out.println("m1 is calling");
	}
	
	void m2()
	{
		System.out.println("m2 is calling");
	}
	
	static void m3()//class methods--using class name
	{
		m4();
		//m1();
		System.out.println("m3 is calling");
		Test1 t1=new Test1();
		t1.m1();
	}
	
	static void m4()
	{
		System.out.println("m4 is calling");
	}
}

public class StaticNonStaticTestDemo {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.m1();
		//Test.m4();
		main();
		main(1);
		Test1.m3();

	}
	
	public static void main()
	{
		System.out.println("main1");
	}
	
	public static void main(int a)
	{
		System.out.println("main2");
	}

}
