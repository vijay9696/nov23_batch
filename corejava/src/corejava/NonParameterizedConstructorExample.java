package corejava;
class Person
{
	String pname;
	int page;
	String paddress;
	
	public Person()
	{
		pname="Poonam";
		page=23;
		paddress="Pune";
	}
	
	public void show()
	{
		System.out.println("Person name:"+pname+" age:"+page+ " address:"+paddress);
	}
}
public class NonParameterizedConstructorExample {

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.show();
		
	}

}
