package corejava;

public class Employee 
{
	//instance variable declaration
	String employee_name="Abhishek";
	int employee_code=101;
	String city="Pune";
	
	//method declaration
	public void displayEmpInfo()
	{
		System.out.println("Employee Name:"+employee_name+" Employee Code:"+employee_code+" city:"+city);
//		System.out.println("Employee Name:"+employee_name);
//		System.out.println("Employee Id:"+employee_code);
//		System.out.println("Employee City:"+city);
	}
	
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.displayEmpInfo();
		Student s1=new Student();
		s1.display();
	}

}
