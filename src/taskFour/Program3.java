package taskFour;
import java.util.Arrays;
public class Program3 {

	public static void main(String[] args) {
		int arr[] = {21,45,32,7,99,56,43,1,0};
		Arrays.sort(arr);
		int j = arr.length;
		int i=0;
		for( i=0;i<j;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nSecond smallest number in the array is : " +arr[1]);
	}

}
