package corejava;

public class FinalKeywordExample 
{
	final int a=30;
//	public FinalKeywordExample()
//	{
//		a=30;
//	}
	public void change()
	{
		//a=30;
		System.out.println("a:"+a);
		
	}
	public static void main(String[] args) {
		FinalKeywordExample fke=new FinalKeywordExample();
		fke.change();
		//FinalKeywordExample.a=30;
	}

}
