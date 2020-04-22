package taskFour;

import java.util.Arrays;

public class Program9 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		Arrays.sort(a);
		int t = 6;
		int i = 0;
		int l = a.length;
		int j = l-1;
		for (i = 0; i < l; i++) {
			for (; j > i; j--) {
				if (a[i] + a[j] == t) {
					System.out.println(a[i] + " " + a[j]);
					break;
				}
			}
		}
	}
}
