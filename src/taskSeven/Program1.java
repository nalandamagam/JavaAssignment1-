package taskSeven;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] str = s.toCharArray();
		int l = str.length;
		for(int i=l-1;i>=0;i--) {
			System.out.print(str[i]);
		}

	}

}
