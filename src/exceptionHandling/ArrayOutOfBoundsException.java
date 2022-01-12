package exceptionHandling;

public class ArrayOutOfBoundsException {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		try
		{
			a[10]=100;
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
