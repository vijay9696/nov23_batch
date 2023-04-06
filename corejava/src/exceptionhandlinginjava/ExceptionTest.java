package exceptionhandlinginjava;
public class ExceptionTest {

	public static void main(String[] args) {
		int num1=20;
		int num2=0;
		try
		{
			int arr[]=new int[5];
			arr[3]=20;
			int res=num1/num2;
			System.out.println("Division:"+res);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bounds "+e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer error "+e.getMessage());
		}
		finally
		{
			System.out.println("A number cannot be divided by zero");
		}
		
	}

}
