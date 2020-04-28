package taskSeven;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter a sring:");
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			int n = 1;
			if(map.containsKey(c)) {
				n = map.get(c)+ 1;
			}
			map.put(c, n);
		}
		
		for(char c: map.keySet()) {
			System.out.println(c +"=" +map.get(c));
		}
	}

}
