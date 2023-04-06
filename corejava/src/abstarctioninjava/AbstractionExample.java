package abstarctioninjava;
abstract class MyTest
{
	MyTest(String name)
	{
		System.out.println("Abstract class constructor"+name);
	}
	abstract void calculate(int a,int b);
	public void show()
	{
		System.out.println("Non abstract method in abstract class");
	}
	public void show1()
	{
		System.out.println("Non abstract method in abstract class");
	}
}

class Addition extends MyTest
{
	Addition(String name)
	{
		super(name);
	}
	@Override
	void calculate(int a, int b) {
		int res=a+b;
		System.out.println("Addition:"+res);	
	}
}

//class Substraction extends MyTest
//{
//
//	@Override
//	void calculate(int a, int b) {
//		int res=a-b;
//		System.out.println("Substraction:"+res);	
//	}
//	
//}
public class AbstractionExample {

	public static void main(String[] args) {
		Addition add=new Addition("Rohit");
		add.calculate(20, 30);
		add.show();
		add.show1();
//		Substraction sub=new Substraction();
//		sub.calculate(50, 20);
		
		//MyTest mytest=new MyTest();//we cannot create object of abstract class
	}

}
