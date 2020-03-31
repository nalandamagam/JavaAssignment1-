package taskThree;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first float number: ");
		float f1 = sc.nextFloat();
		System.out.print("Enter second float number: ");
		float f2 = sc.nextFloat();
		
		int a = (int)(f1*100);
		int b = (int)(f2*100);
		if(a ==b ) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
	}

}
