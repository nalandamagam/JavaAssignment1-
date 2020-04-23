package taskFive;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int a[] = { 2, 5, 3, 1, 7, 4, 8, 9, 4 };
		int i = 0, sum = 0;
		Arrays.sort(a);
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (i = 1; i < a.length - 1; i++) {
			sum = sum + a[i];
		}
		System.out.println("Sum of the elements except the first and the last element is: " + sum);

	}

}
