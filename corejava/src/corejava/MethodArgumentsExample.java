package corejava;
class Arguments
{
	public int add(int a,int b)//parameters
	{
		int c=a+b;
		return c;
	}
}
public class MethodArgumentsExample {

	public static void main(String[] args) {
		Arguments arg=new Arguments();
		int add1=arg.add(10, 20);//arguments---call by value
		System.out.println(add1);
		System.out.println(arg.add(44, 55));
		System.out.println(arg.add(34, 67));

	}

}
