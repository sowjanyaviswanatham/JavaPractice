package exceptionHandling;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		String res = null ;
		try
		{
			//res =a/b;
			int a  = res.length();
		}catch(Exception e)
		{
			System.out.println("Exception caught: " + e);
		}
		finally
		{
			System.out.println("We are in Finally block:");
		}	
	}

}
