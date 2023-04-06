package oopinjava;
class AAA
{
	public void msgA()
	{
		System.out.println("From class A");
	}
}
class BBB extends AAA
{
	public void msgB()
	{
		System.out.println("From class B");
	}
}
class C extends AAA
{
	public void msgC()
	{
		System.out.println("From class C");
	}
}
class D extends AAA
{
	public void msgD()
	{
		System.out.println("From class D");
	}
}
public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		BBB b=new BBB();
		b.msgA();
		b.msgB();
		
		C c=new C();
		c.msgA();
		c.msgC();
		
		D d=new D();
		d.msgA();
		d.msgD();

	}

}
