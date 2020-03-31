package taskTwo;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		
		while(num>=0) {
			System.out.println("Good Going");
			System.out.print("Enter number:");
			num = sc.nextInt();
		}
		System.out.println("It's Over");

	}

}
