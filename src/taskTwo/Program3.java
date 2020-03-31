package taskTwo;

public class Program3 {
public static void main(String args[]) {
	int a =10,b=20,c=30;
	float avg = (a+b+c)/3;
	System.out.println("avg = "+avg);
	if(avg>a && avg>b && avg>c) {
		System.out.println("Average is higher than a,b,c");
	}
	else if(avg>a && avg>b){
		System.out.println("Average is greater than a,b,c");
	}
	else if(avg>a && avg > c) {
		System.out.println("Average is greater than a,c");
	}
	else if(avg<b && avg > c) {
		System.out.println("Average is greater than b,c");
	}
	else if(avg >a) {
		System.out.println("a=Average is just higher than a");
	}
	else if(avg>b) {
		System.out.println("Average is just higher than b");
	}
	else if(avg>c) {
		System.out.println("Average is higher than c");
	}
}
}
