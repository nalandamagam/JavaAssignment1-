package taskFour;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 2, 2 };
		Arrays.sort(arr);
		int i = 0, j = 0;
		while (i < arr.length) {
			if (i == 0 || arr[i] != arr[j - 1]) {
				arr[j] = arr[i];
				j++;
			}
			i++;
		}
		for (int k = 0; k < j; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
