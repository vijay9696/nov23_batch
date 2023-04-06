package corejava;

public class NestedIf {

	public static void main(String[] args) {
		if(true)
		{
			System.out.println("Outer 1");
			if(false)
			{
				System.out.println("Inner");
			}
			else
			{
				System.out.println("Inner else");
				if(true)
				{
					System.out.println("Inner else if");
				}
				else
				{
					System.out.println("Inner else else");
				}
			}
		}
		else
		{
			System.out.println("outer else");
			if(true)
			{
				System.out.println("Inner if");
				if(true)
				{
					System.out.println("inner inner if");
				}
				else
				{
					System.out.println("inner inner else");
				}
			}
		}
		

	}

}
