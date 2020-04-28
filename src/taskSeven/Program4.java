package taskSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
		System.out.println();
		for (int i = 0; i < str.length-1; i++) {
			if (str[i] == str[i+1]) {
				System.out.println("It has repetitive characters!");
				return;
			}
		}
		System.out.println("It has all unique characters!");
	}

}
