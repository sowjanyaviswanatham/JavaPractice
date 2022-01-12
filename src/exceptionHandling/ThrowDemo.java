package exceptionHandling;

public class ThrowDemo {
	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
			
		}
		System.out.println("Eliguble to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		validate(18);
		System.out.println("rest of code");

	}

}
