package taskFour;

import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 4, 3, 6, 4, 2, 7, 6, 6, 7, 9, 3, 9 };
		Arrays.sort(a);
		int i = 0, j = 0;
		while (i < a.length) {
			if (i == 0 || a[i] != a[j - 1]) {
				a[j] = a[i];
				j++;
			}
			i++;
		}
		for (int k = 0; k < j; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		System.out.println(j);
	}

}
