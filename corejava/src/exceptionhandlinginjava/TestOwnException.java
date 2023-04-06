package exceptionhandlinginjava;
class OenException extends Exception
{
	public OenException(String str)
	{
		super(str);
	}
	
}
public class TestOwnException {

	public static void main(String[] args) {
		try
		{
			OenException oe=new OenException("User Defined Exception");
			throw oe;
		}
		catch(OenException oe)
		{
			System.out.println("Exception Caught:"+oe.getMessage());
		}

	}

}
