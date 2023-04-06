package oopinjava;
class ABC
{
	public ABC()
	{
		System.out.println("Default constructor");
	}
	public ABC(int x)
	{
		this();
		System.out.println("Parameterized constructor");
	}
	
	void m1(ABC a)
	{
		System.out.println("m1");
	}
	void m2()
	{
		m1(this);
		System.out.println("m2");
	}
}
public class UsingThisInConstructorExample {

	public static void main(String[] args) {
		ABC abc=new ABC(22);
		abc.m2();
	}

}
