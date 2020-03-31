package taskThree;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long l = sc.nextLong();
		long n = 0, sum = 0, count = 0;
		while (l != 0) {
			n=l%10;
			sum = sum + n;
			l = l / 10;
			count++;
			// System.out.println("in");
		}
		System.out.println("Number of digits are: " + count);
		System.out.println("sum = " + sum);

	}

}
