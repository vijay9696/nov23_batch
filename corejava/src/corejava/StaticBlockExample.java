package corejava;

public class StaticBlockExample 
{
	{
		System.out.println("Instance block1");
	}
	{
		System.out.println("instance block2");
	}
	static {
		System.out.println("Static Block1");
	}
	
	static {
		System.out.println("Static Block2");
	}

	StaticBlockExample() {
		System.out.println("Default constructor");
	}
	
	StaticBlockExample(int a){
		System.out.println("1 Para constructor");
	}
	public static void main(String[] args) 
	{
		//System.out.println("Main method");
		StaticBlockExample sbe=new StaticBlockExample();
		StaticBlockExample sbe2=new StaticBlockExample(20);

	}

}
