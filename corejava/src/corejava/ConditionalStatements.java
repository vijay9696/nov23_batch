package corejava;

public class ConditionalStatements 
{
	public static void main(String[] args) 
	{
//		int a=20,b=10;
//		if(a<b)
//		{
//			System.out.println("a is greater than b");
//		}
//		else
//		{
//			System.out.println("a is smaller than b");
//		}
		
		int per=0;
		if(per>=0 && per<35)
		{
			System.out.println("Failed");
		}
		else if(per>=35 && per<=50)
		{
			System.out.println("Pass");
		}
		else if(per>50 && per<60)
		{
			System.out.println("Second class");
		}
		else if(per>=60 && per<=70)
		{
			System.out.println("First Class");
		}
		else if(per>70 && per<=100)
		{
			System.out.println("distinction");
		}
		else
		{
			System.out.println("Wrong marks");
		}

	}

}
