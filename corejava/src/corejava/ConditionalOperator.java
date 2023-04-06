package corejava;

public class ConditionalOperator {

	public static void main(String[] args) {
		int a=30;
		int b=20;
		
		int result=(a<b)?a:b;
		System.out.println("Result="+result);
		
		int age=17;
		String str1="Eligible for vote";
		String str2="Not eligible for vote";
		
		String result1=(age>18)?str1:str2;
		System.out.println(result1);

	}

}
