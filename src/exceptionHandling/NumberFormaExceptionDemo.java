package exceptionHandling;

public class NumberFormaExceptionDemo {

	public static void main(String[] args) {
		String s = "abc" ;
		try
		{
			//res =a/b;
			int a  = Integer.parseInt(s);
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
