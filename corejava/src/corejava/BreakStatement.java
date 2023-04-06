package corejava;

public class BreakStatement {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=10;i++)
		{
			if(i==8)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
	}

}
