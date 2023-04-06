package corejava;

class CallByValue
{
	int change(int b)
	{
		++b;//b=b+1=21--->This statement change the copy only but not the original
		return b;
		
	}
}
public class CallByValueExample {

	public static void main(String[] args) {
		CallByValue obj=new CallByValue();
		int a=20;
		int x=obj.change(a);
		System.out.println("a:"+a);
		System.out.println("x:"+x);

	}

}
