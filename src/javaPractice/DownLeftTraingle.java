package javaPractice;

import java.util.Scanner;

public class DownLeftTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = input.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			
		
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}

			System.out.println("");
			
			

		}
	}
}
