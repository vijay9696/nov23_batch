package oopinjava;
class PersonData
{
	int age=50;
	public PersonData()
	{
		//invisible super()
		System.out.println("super class constructor");
	}
	
	public void displayPersonData()
	{
		System.out.println("Superclass method");
	}
}
class EmployeeData extends PersonData
{
	int age=30;
	public EmployeeData()
	{
		super();
		System.out.println("Sub class constructor");
		
	}
	void insertAge()
	{
		super.displayPersonData();
		int age=20;
//		PersonData pd=new PersonData();
		System.out.println(super.age);
		System.out.println(age);
	}
}
public class Person 
{

	public static void main(String[] args) {
		
		EmployeeData ed=new EmployeeData();
		EmployeeData ed1=new EmployeeData();
		EmployeeData ed2=new EmployeeData();
		ed.insertAge();
		System.out.println(ed.age);
	}

}
