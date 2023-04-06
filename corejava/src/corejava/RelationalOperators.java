package corejava;

public class RelationalOperators {

	public static void main(String[] args) {
		int x=10;
		int y=30;
		System.out.println("x:"+x);
		System.out.println(("y:"+y));
		
		System.out.println("x is less than y:"+(x<y));
		System.out.println("x is greater than y:"+(x>y));
		
		System.out.println("x is less than or equal to y:"+(x<=y));//true
		System.out.println("x is greater than or equal to y:"+(x>=y));//false
		
		System.out.println("x is equal to y:"+(x==y));//false
		System.out.println("x is not equal to y:"+(x!=y));//true
		
		System.out.println("(x+20<y+10):"+(x+20<y+10));//true
		
		if(x<y)
		{
			System.out.println("x is less than Y");
		}
		else
		{
			System.out.println("x is greater than y");
		}
	}

}
