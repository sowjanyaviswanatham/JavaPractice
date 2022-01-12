package exceptionHandling;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Demo on multiple ctach blocks");
		int a[] = new int[5];
		try
		{
			//a[10] = 30/0;//Throes atihamatic exception
			//a[10] = 20;//throws arrayOutofIndexBound exception
			String s =null; // throws parent exception bcoz there is no specific "nullpointexception handler"
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception occurs" );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Indx OutOf bounds exception");
		}
		catch(Exception e) //Excetion is the parent class of all exceptions
		{
			System.out.println("Parent exception ");
		}
		System.out.println("Prist the rest of code");
	}
	

}
