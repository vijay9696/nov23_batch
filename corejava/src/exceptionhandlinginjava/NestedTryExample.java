package exceptionhandlinginjava;

public class NestedTryExample {

	public static void main(String[] args) {
		String str="Java";
		int arr[]= {0,1,2,3,4};
		try
		{
			//str=null;
			int strlength=str.length();
			System.out.println("String Length:"+strlength);
			try
			{
				str=null;
				int stlength=str.length();
				System.out.println("String Length:"+stlength);
				int y=6;
				System.out.println(arr[y]);
			}
			catch(ArrayIndexOutOfBoundsException aioobe)
			{
				System.out.println(aioobe.getMessage());
			}
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
		}

	}

}
