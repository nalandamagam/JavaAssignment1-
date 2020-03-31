package taskFour;
import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,56,23,98,45,90,120,56};
		Arrays.sort(arr);
		int i = (arr.length)-2;
		System.out.println("Second largest element is " +arr[i]);
	}

}
