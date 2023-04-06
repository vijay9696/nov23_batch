package corejava;

public class DoWhileExample {

	public static void main(String[] args) {
		int i=1;//counter initialization
		do
		{
			System.out.println("i:"+i);
			i++;//counter increment
		}
		while(i<10);//test condition
		System.out.println("Exit from loop at i="+i);
	}

}
