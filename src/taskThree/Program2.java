package taskThree;

import java.util.Scanner;

public class Program2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int avg =0;
		for (int a = 0; a <= 9; a++) {
			System.out.print("Enter number:");
			int i = sc.nextInt();
			sum = sum + i;
		}
		System.out.println("Sum of the given numbers is: " + sum);
		avg = sum/10;
		System.out.println("Average of the 10 numbers is " +avg);
	}
}
