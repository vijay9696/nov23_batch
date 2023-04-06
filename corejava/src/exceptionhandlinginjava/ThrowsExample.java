package exceptionhandlinginjava;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try
		{
			int z=10/0;
			//ArithmeticException ae=new ArithmeticException("Explicit Exception handling");
			throw new ArithmeticException();
			//System.out.println("Result:"+z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught:"+ae.getMessage());
		}

	}

}
