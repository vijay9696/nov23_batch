package arraysinjava;

public class DemoArray {

	public static void main(String[] args) {
		int empid[]=new int[5];
		System.out.println("Array size:"+empid.length);
		empid[0]=101;
		empid[1]=102;
		empid[2]=103;
		empid[3]=104;
		empid[4]=105;
		//empid[5]=106;
		System.out.println("empid[2]:"+empid[2]);
		
		String studName[]= {"Abhishek","Ajay","Suresh","Kritika"};
		System.out.println("studeName size:"+studName.length);
		System.out.println("studName[2]:"+studName[2]);
		int i;
		for(i=0;i<studName.length;i++)
		{
			System.out.println("student["+i+"]:"+studName[i]);
		}
		//System.out.println("Out of array at"+studName[i]);
		

	}

}
