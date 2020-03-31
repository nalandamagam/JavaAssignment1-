package taskTwo;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int a = sc.nextInt();
		if(a%2==0) {
			if((a>=2 && a<=5) || a>30) {
			//if(a>=2 && a<=5 && a>30) 
				System.out.print("OLD");
			}
			else {
				System.out.print("NEW");
			}
		}
		else {
			System.out.print("NEW");
		}

	}

}
