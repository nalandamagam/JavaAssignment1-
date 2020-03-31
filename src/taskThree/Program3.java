package taskThree;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int i = sc.nextInt();
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
			System.out.println("31");
		}else if(i == 2) {
			System.out.println("28 or 29");
		}
		else {
			if(i <1 || i>12) {
				System.out.println("Invalid Details");
			}
			else {
				System.out.println("30");
			}
		}
	}

}
