package corejava;
class Student1
{
	
}
class Library
{
	
}
class Admin
{
	
}
class Employee1
{
	
}
public class CallByReferenceExample {

	public void m1(Student1 s1,Library l1)
	{
		System.out.println("m1 calling");
	}
	
	public void m2(Admin a, Employee1 e)
	{
		System.out.println("m2 calling");
	}
	public static void main(String[] args) {
		CallByReferenceExample cbr=new CallByReferenceExample();
		Student1 s=new Student1();
		Library l=new Library();
		System.out.println(s);
		System.out.println(l);
		cbr.m1(s, l);

	}

}
