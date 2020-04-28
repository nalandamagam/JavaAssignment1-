package taskSeven;

public class Program6 {

	public static void main(String[] args) {
		String s = "153";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int x = Integer.parseInt(s.substring(i, i+1));
			sum = sum + (x*x*x);
		}
		System.out.println(sum);
		int x =Integer.parseInt(s);
		if(sum == x) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
	}

}
