package exceptionHandling;

public class NoSpecifOrderofCatchBlocks {

	public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Demo on multiple ctach blocks");
		int a[] = new int[5];
		try
		{
			a[10] = 30/0;//Throes atihamatic exception
			//a[10] = 20;//throws arrayOutofIndexBound exception
		//	String s =null; // throws parent exception bcoz there is no specific "nullpointexception handler"
			//System.out.println(s.length());
		}
		catch(Exception e){System.out.println("common task completed");}
	

	}
}

