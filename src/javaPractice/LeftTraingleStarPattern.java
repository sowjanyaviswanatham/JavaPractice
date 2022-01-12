package javaPractice;

import java.util.Scanner;

public class LeftTraingleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n = input.nextInt();
		int k = 2*n-2;
		for(int i=1;i<=n;i++)
		{
			//Inner loop for printing space
			for(int j=1;j<=k;j++)
			{
				System.out.print(" ");
			}
			//inner loop for printing the star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			k=k-2;
			System.out.println();
					
			
		}

	}

}
