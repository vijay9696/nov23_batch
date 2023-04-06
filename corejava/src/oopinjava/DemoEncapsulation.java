package oopinjava;

public class DemoEncapsulation {

	public static void main(String[] args) {
//		Student s=new Student();
//		s.setName("Abhishek");
//		String name=s.getName();
//		System.out.println("Name="+name);
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Alex");
		emp.setEmpSalary(80000d);
		
		System.out.println("EmpId:"+emp.getEmpId()+" EmpName:"+emp.getEmpName()+" EmpSalary:"+emp.getEmpSalary());
	}

}
