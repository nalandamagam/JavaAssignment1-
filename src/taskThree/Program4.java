package taskThree;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int i = sc.nextInt();
		int sum = 0;
		for(int x = i;x>=0 ;x--) {
			sum=sum+x;
		}
System.out.println("sum =" + sum);
	}

}
