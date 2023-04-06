package corejava;

public class Student 
{
   /*variables*/
	String name="Narayan";
	int rollNo=1;
	int id=101;
	int age=23;
	
	//method
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("RollNo : "+rollNo);
		System.out.println("Id: "+id);
		System.out.println("Age: "+age);	
	}
	
	public static void main(String args[]) 
	{
		//create a object of class of Student
		Student s1=new Student();
		s1.name="Vijay";
		s1.rollNo=20;
		s1.id=300;
		s1.age=32;
		s1.display();
	}

}
