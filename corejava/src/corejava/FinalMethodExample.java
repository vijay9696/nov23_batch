package corejava;
class A
{
//	final A()
//	{
//		
//	}
//	final static {
//		
//	}
	void showA()
	{
		System.out.println("class A invoked");
	}
}

class B extends A
{
	void showA()
	{
		System.out.println("class B invoked");
	}
}
public class FinalMethodExample {

	public static void main(String[] args) {
		B b=new B();
		b.showA();
	}

}
