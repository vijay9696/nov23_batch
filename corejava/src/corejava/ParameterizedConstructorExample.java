package corejava;
class Demo
{
	
	public Demo()
	{
		System.out.println("No argument constructor");
	}
	public Demo(int a)
	{
		System.out.println("One param constructor");
		System.out.println("a:"+a);
	}
	public Demo(int x,float y)
	{
		System.out.println("Two Param constructor");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	public Demo(int x,double y)
	{
		System.out.println("Two Param constructor");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo(10);
		Demo d3=new Demo(22,33.0f);
		Demo d4=new Demo(22,33.0d);

	}

}
