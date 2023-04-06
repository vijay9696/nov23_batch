package oopinjava;

class A 
{
	int a=10;
	public void showA()
	{
		System.out.println("Value of a in A:"+a);
	}
}

class B extends A
{
	int a=20;
	public void showB()
	{
		System.out.println("Value of b in B:"+a);
		//System.out.println("Add a and b:"+(a+b));	
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		A b = new B();
		System.out.println("a:"+b.a);
	}

}
