package oopinjava;
class ThisClass
{
	public void msg()
	{
		System.out.println(this);
	}
}
public class ThisKeywordInJavaExample {

	public static void main(String[] args) {
		ThisClass thisClass=new ThisClass();
		System.out.println("thisClassObject address:"+thisClass);
		//thisClass.msg();
		ThisClass thisClass1=new ThisClass();
		System.out.println("thisClassObject address:"+thisClass1);
		thisClass1.msg();
	}

}
