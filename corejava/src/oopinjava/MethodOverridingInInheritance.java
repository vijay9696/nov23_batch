package oopinjava;

class ParentClass
{
	int a=33;
	void m1()
	{
		System.out.println("Parent class method");
	}
}

class ChildClass extends ParentClass
{
	int a=44;
	void m1()
	{
		System.out.println("Child class method");
	}
}
public class MethodOverridingInInheritance {
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		cc.m1();
		ParentClass pc;
		pc=new ChildClass();
		pc.m1();
		System.out.println(pc.a);

	}

}
