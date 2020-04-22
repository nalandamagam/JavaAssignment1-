package taskFour;

import java.util.Arrays;

public class Program10 {

	public static void main(String[] args) {
		int a[] = { 1, -3, 2, -6, -8, 5, -6 };
		//Arrays.sort(a);
		int l = a.length,k=0,x=Integer.MAX_VALUE;
		int c=0, d=0;
		for (int i = 0; i < l; i++) {
			for (int j = l - 1; j > i; j--) {
				k=Math.abs(a[i] + a[j]);
				if(k<x) {
					c = i;
					d = j;
					x=k;
				}

			}
		}
		System.out.println(c +" " + d +" " +k);
	}

}
