package taskFour;

import java.util.Arrays;

public class Program7 {

	public static void main(String[] args) {
		int a[] = { 1, 45, 6, 32, 78, 90, 76, 4, 7, 23, 7 };
		Arrays.sort(a);
		int l = a.length, i = 0;
		int diff = 0;
		for (i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		diff = a[l - 1] - a[0];
		System.out.println();
		System.out.println("Difference between max and min numbers in the array is : " + diff);

	}

}
