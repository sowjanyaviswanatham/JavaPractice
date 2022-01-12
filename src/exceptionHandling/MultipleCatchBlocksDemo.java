package exceptionHandling;

public class MultipleCatchBlocksDemo {

	public static void main(String[] args) {

		String s = "abc" ;
		try
		{
			//res =c/b;
			int a  = Integer.parseInt(s);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception caught: " + e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception caught: " + e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception caught: " + e);
		}
		finally
		{
			System.out.println("We are in Finally block:");
		}

	}

	}


