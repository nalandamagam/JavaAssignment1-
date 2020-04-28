package taskSeven;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		System.out.print(words.length);

	}

}
