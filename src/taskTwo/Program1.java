package taskTwo;

import java.util.Scanner;

public class Program1 {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	//int result=0;
	if(num %3 ==0 && num %5 ==0) {
		System.out.println("Consultadd JAVA Training");
	}
	else if(num%5 ==0) {
		System.out.println("JAVA Training");
	}
	else if(num % 3 ==0) {
		System.out.println("Consultadd");
	}
	else {
		System.out.println("The given number is not divisible by 3 or 5 or both");
	
}
}
}
