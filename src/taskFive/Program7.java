package taskFive;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter the braces: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		int[] brackets = new int[3];
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '(') {
				brackets[0]++;
			} else if (str[i] == ')') {
				brackets[0]--;
			}
			else if(str[i]=='{') {
				brackets[1]++;
			}else if(str[i]=='}') {
				brackets[1]--;
			}
			else if(str[i]=='[') {
				brackets[2]++;
			}
			else {
				brackets[2]--;
			}
		}

		for (int i = 0; i < brackets.length; i++) {
			if(brackets[i]!=0) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");

	}

}
