package taskThree;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int i = sc.nextInt();

		if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
	}

}
