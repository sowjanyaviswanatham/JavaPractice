package exceptionHandling;

import java.util.Scanner;

public class DividebyZeroExceptionDemo {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter two nunmbers:");
		//int a = input.nextInt();
		//int b = input.nextInt();
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
