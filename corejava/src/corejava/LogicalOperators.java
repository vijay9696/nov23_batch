package corejava;

public class LogicalOperators {

	public static void main(String[] args) {
		int x=10,y=5,z=3;
		boolean result=(x==10 && y==5);
		System.out.println(result);
		System.out.println((x==10&&y>x));//false
		System.out.println((x<y&&y>x));//false
		
		if(x>y&&y>z)
		{
			System.out.println("Hiiiii");
		}
		boolean result1=(x==10 || y==5);
		System.out.println(result1);//true
		System.out.println((x==10||y>x));//true
		System.out.println((x<y||y>x));//false
		
		if(x>y||y>z)//true
		{
			System.out.println("Hiiiii");
		}
		
        System.out.println((!(x+2==1+2)));//true
        System.out.println((!(x==y)&&(y+5==1+2)&&(!(z-3==0))));//false
	}

}
