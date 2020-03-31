package taskTwo;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to perform operation:");
		int choice = sc.nextInt();
		System.out.print("Enter first number:");
		int a = sc.nextInt();
		System.out.print("Enter second number:");
		int b = sc.nextInt();
		int res =0;
		switch (choice) {
		case 1:
			res = a + b;
			System.out.println("Result of first operation is " + res);
			break;
		case 2:
			res = a - b;
			System.out.println("Result of second operation is :" + res);
			break;
		case 3:
			res = a / b;
			System.out.println("Result of third operation is :" + res);
			break;
		case 4:
			res = a * b;
			System.out.println("Result of fourth operation is:" + res);
			break;
		case 5:
			System.out.println("Enter third number:");
			int c = sc.nextInt();
			System.out.println("Enter fourth number:");
			int d = sc.nextInt();
			res = (a + b + c + d) / 4;
			System.out.println("Result of fifth operation is:" + res);
			break;

		}
		
		if (res<0) {
			System.out.println("Oops X(1/2/3/4/5)is returning the negative number");
		}
	}

}
/*
 * switch(result) { case 1: System.out.println(""); break; case 2:
 * System.out.println(""); break; case 3: System.out.println(""); break;
 * default: }
 */