package taskSeven;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		Arrays.sort(str);
//		System.out.println(str);
		String unique = "";
		for (int i = 0; i < str.length; i++) {
			if ((i == 0 && str[i] != str[i + 1]) || (i == str.length - 1 && str[i] != str[i - 1])
					|| (str[i] != str[i + 1] && str[i] != str[i - 1])) {
				unique += str[i];
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (unique.contains(s.substring(i, i + 1))) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
