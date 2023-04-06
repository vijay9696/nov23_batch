package corejava;
class Person1
{
	String pname;
	int page;
	String paddress;
	
	public Person1(String pname,int page,String paddress)
	{
		this.pname=pname;
		this.page=page;
		this.paddress=paddress;
	}
	public void display()
	{
		System.out.println("Person name:"+pname+" age:"+page+ " address:"+paddress);
	}
}
public class ParameterizedConstructorExample1 {

	public static void main(String[] args) {
		Person1 p1=new Person1("Poonam",23,"Pune");
		p1.display();
	}

}
