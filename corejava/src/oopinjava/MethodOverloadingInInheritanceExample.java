package oopinjava;
class AnimalData1
{
	public AnimalData1()
	{
		
	}
	void food()
	{
		System.out.println("What kind of food lions eat?");
	}
	
	void food(int x, int y)
	{
		System.out.println("What kind of food lions not eat?");
	}
}
class Lion extends AnimalData1
{
	Lion()
	{
		
	}
	void food(int x)
	{
		System.out.println("Lions eat meat");
	}
}
class lioness extends Lion
{
	void food(String str)
	{
		System.out.println("Lioness eat deers meat");
	}
}
public class MethodOverloadingInInheritanceExample {
	public static void main(String[] args) {
//		Animal animal=new Animal();	
//		animal.food();
//		Lion lion=new Lion();
//		lion.food();
//		lion.food(10);
		lioness liness=new lioness();
		//liness.food(10,20);
	}

}
