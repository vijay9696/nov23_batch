package corejava;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=scannerObj.nextLine();
		System.out.println("Enter Age:");
		int age=scannerObj.nextInt();
		System.out.println("Enter Salary:");
		float salary=scannerObj.nextFloat();
		
		System.out.println("Name:"+name+" Age:"+age+" Salary:"+salary);

	}

}
