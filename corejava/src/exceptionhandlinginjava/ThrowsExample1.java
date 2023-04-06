package exceptionhandlinginjava;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsTest
{
	private int name;
	public void takeName() throws InputMismatchException
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=input.nextInt();
	}
	public void showName()
	{
		System.out.println("Name:"+name);
	}
}
public class ThrowsExample1 {

	public static void main(String[] args) {
		ThrowsTest tt=new ThrowsTest();
		try
		{
			tt.takeName();
			tt.showName();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Provide integer values only"+e.getMessage());
		}
		

	}

}
