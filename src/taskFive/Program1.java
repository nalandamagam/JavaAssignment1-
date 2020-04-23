package taskFive;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println(" Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		String[] words = s.split(" ");
		int length = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < length) {
				length = words[i].length();
			}
		}
		System.out.println(length);

	}

}
