package oopinjava;
class P
{
	int x=40;
}
class Q extends P
{
	int x=50;
}
public class InstanceVariableInInheritanceExample {

	public static void main(String[] args) {
		
		P p=new Q();
		System.out.println("x:"+p.x);
	}

}
