package taskTwo;
import java.util.Scanner;
//import java.lang.*;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		float f = sc.nextFloat();
		if(f==0) {
			System.out.println("Zero");
		}
		else if(f<0) {
			System.out.println("Negative");
		}
		else if(f>0) {
			System.out.println("Positive");
		}else if(Math.abs(f)<1) {
			System.out.println("Small");
		}
		else if(f>1000000) {
			System.out.println("Large");
		}
	}

}
