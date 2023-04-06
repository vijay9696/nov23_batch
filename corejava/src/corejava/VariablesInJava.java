package corejava;

public class VariablesInJava 
{
	//declaration of instance variables
	int a;
	int b=10;
	
	//declaration of static variables
	static double d=200.65d;
	public void schoolName()
	{
		//declaration of local variables
		String schoolName="AISSMS";
		System.out.println(schoolName);
		System.out.println(a);
		System.out.println(d);
	}
	
	public static void show()
	{
//		System.out.println(a); cannot accessed here because declared as instance variables
		//System.out.println(b);
		System.out.println(d);
		//System.out.println(schoolName);//access denied due to schoolName is a local variable
	}

	public static void main(String[] args) {
		show();
		VariablesInJava vij=new VariablesInJava();
		vij.schoolName();
	}

}
