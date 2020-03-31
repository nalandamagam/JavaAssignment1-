package taskThree;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(+n+" x " + i + " = " +(n*i));
		}
	}

}
