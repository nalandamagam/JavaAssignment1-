package taskFive;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 'a' && str[i] <= 'z') {
				str[i] = (char) (str[i] - 32);
			} else if (str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char) (str[i] + 32);
			}
		}
		System.out.println(str);

	}

}
