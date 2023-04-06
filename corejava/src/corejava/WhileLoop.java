package corejava;

public class WhileLoop {

	public static void main(String[] args) {
		int i=0;
		while (i<=10) 
		{
			System.out.println("i:"+i);
			i++;
		}
		System.out.println("out of loop for i="+i);
		
		int j=10;
		while(j>=1)
		{
			System.out.println("j="+j);
			j--;
		}
		System.out.println("out of loop for j="+j);

	}

}
