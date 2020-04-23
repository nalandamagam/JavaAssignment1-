package taskFive;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		System.out.println("Enter a string: " );
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		s=s.replaceAll("\\s","");
		System.out.println(s);


	}

}
