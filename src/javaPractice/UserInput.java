package javaPractice;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input = new Scanner(System.in);
		
System.out.println("Enter name,age,sal,status");
		String name = input.nextLine(); //nextline() is used to read the string input from the user
		int age = input.nextInt();//nextInt() is used to read the integer input from the user
		float sal =  input.nextFloat();//nextFloat() is used to read the float input from the user
		boolean isWorking = input.nextBoolean(); //nextBoolean() is to read the boolean input from the user
	
		System.out.println("name:"+name);
		
		System.out.println("age:"+age);
		
		System.out.println("salary:"+sal);
	
	System.out.println("working:"+isWorking);
		input.close();

	}

}
