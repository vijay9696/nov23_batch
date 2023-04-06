package corejava;

class Box
{
	int length=20;
	int height=30;
	int width=33;
	
	public int areaOfBox()
	{
		return length*width*height;
	}
	
	public Student show()
	{
		Student s=new Student();
		return s;
	}
	
	public Employee show1()
	{
		Employee emp=new Employee();
		return emp;
	}
}
public class MethodReturnValue {

	public static void main(String[] args) {
		Box box=new Box();
		int area=box.areaOfBox();
		System.out.println("Area of Box is:"+area);
		Student myobj=box.show();
		myobj.display();
		
		Employee empObj=box.show1();
		empObj.employee_code=200;
		empObj.displayEmpInfo();
	}

}
