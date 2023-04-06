package corejava;

public class SwitchCaseExample {

	public static void main(String[] args) {
//		int per=90;
//		switch(per)
//		{
//			case 40:
//				System.out.println("Pass");
//				break;
//			case 60:
//				System.out.println("First Class");
//				break;
//			case 70:
//				System.out.println("Distinction");
//				break;
//			case 80:
//				System.out.println("Excellent");
//				break;
//			default:
//				System.out.println("Fail");
//		}
		
		char city='m';
		switch(city)
		{
			case 'm':
				System.out.println("Mumbai");
				break;
			case 'n':
				System.out.println("Nashik");
				break;
			case 'p':
				System.out.println("Pune");
				char subcity='m';
				switch(subcity)
				{
					case 'm':
						System.out.println("Mundwa");
						break;
					case 'b':
						System.out.println("bhosari");
						break;
					default:
						System.out.println("Wrong subcity");
				}
				break;
			case 's':
				System.out.println("Satara");
				break;
			default:
				System.out.println("Wrong city option");
		}

	}

}
