package polymorphisminjava;
class Base
{
	int x=10;
	public void m1(String name)
	{
		System.out.println("Base:"+name+" x:"+x);
	}
}
class Derived extends Base
{
	int x=20;
	public void m1(String name)
	{
		System.out.println("Derived:"+name+" x:"+x);
	}
}
class Derived1 extends Base
{
	int x=40;
	public void m1(String name)
	{
		System.out.println("Derived:"+name+" x:"+x);
	}
}
public class DynamicPolymorphismExample {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.m1("Java");
		Base b;
		b=new Derived();
		b.m1("Java");
		b=new Derived1();
		b.m1("Programing");
		System.out.println(b.x);
	}

}
