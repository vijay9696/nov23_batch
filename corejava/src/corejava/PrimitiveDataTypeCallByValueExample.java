package corejava;

class Pdt
{
	public void m1(int a, char ch)
	{
		System.out.println("m1 is calling");
		System.out.println("a:"+a+" ch:"+ch);
	}
	
	public void m2(Student s)
	{
		s.display();
	}
}
public class PrimitiveDataTypeCallByValueExample {

	public static void main(String[] args) {
		Pdt pdt=new Pdt();
		pdt.m1(33,'A');
		Student mystudent=new Student();
		pdt.m2(mystudent);
	}

}
