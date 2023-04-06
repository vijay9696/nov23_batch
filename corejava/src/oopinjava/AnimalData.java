package oopinjava;

public class AnimalData 
{
	String animal_name;
	int animal_id;
	public AnimalData(String animal_name,int animal_id)
	{
		this.animal_name=animal_name;
		this.animal_id=animal_id;
	}
	public void displayAnimalInfo()
	{
		System.out.println("Animal Name:"+animal_name);
		System.out.println("Animal ID:"+animal_id);
	}
	public static void main(String[] args) 
	{
		AnimalData ad=new AnimalData("Lion",101);
		ad.displayAnimalInfo();

	}

}
