package taskThree;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a number: ");
		// String str = sc.nextLine();
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		if (a > b && b > c) {
			System.out.println("Decreasing");
		} else if (a < b && b < c) {
			System.out.println("Increasing");
		} else {
			System.out.println("Neither increasing nor decreasing");
		}
	}
}
