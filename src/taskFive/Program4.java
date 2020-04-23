package taskFive;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		String[] words = s.split(" ");
		String revstr = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revstr = revstr + revWord + " ";
		}
		System.out.println(revstr);

	}

}
