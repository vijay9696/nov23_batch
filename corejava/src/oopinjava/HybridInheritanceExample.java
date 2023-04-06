package oopinjava;
class AAAA
{
	public void msgA()
	{
		System.out.println("From class A");
	}
}
class BBBB extends AAAA
{
	public void msgB()
	{
		System.out.println("From class B");
	}
}
class CCCC extends BBBB
{
	public void msgC()
	{
		System.out.println("From class C");
	}
}
class DDDD extends BBBB
{
	public void msgD()
	{
		System.out.println("From class D");
	}
}
public class HybridInheritanceExample {

	public static void main(String[] args) {
		
		CCCC c=new CCCC();
		c.msgA();
		c.msgB();
		c.msgC();
		
		DDDD d=new DDDD();
		d.msgA();
		d.msgB();
		d.msgD();
	}

}
