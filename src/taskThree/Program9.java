package taskThree;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
