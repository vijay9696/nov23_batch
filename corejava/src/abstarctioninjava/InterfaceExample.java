package abstarctioninjava;
interface A
{
	int x=20;
	int y=30;
	void show();
}
interface B extends A
{
	int z=40;
	void show1();
}
class TestClass implements A,B
{
	@Override
	public void show() {
		System.out.println("method from interface A");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}

	@Override
	public void show1() {
		System.out.println("method from interface B");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		TestClass tc=new TestClass();
		tc.show();
		tc.show1();

	}

}
