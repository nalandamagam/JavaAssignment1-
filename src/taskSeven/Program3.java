package taskSeven;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		int[] a1 = { 2, 7, 1, 6, 4, 9 };
		int[] a2 = { 5, 4, 3, 7, 9 };
		Arrays.sort(a1);
		Arrays.sort(a2);
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					System.out.print(a1[i] + " ");
				}
			}
		}

	}

}
