package taskFour;
import java.util.Arrays;
public class Program6 {

	public static void main(String[] args) {
		int arr[] = {2,2,3,3,4,4,4,5,5,5,6,7,7};
		int i=0,j=0;
		while(i < arr.length) {
			if( i ==0 || arr[i]!= arr[j-1]) {
				arr[j] = arr[i];
				j++;
			}
			i++;
		}
		/*for(int k=0;k<j;k++) {
			System.out.print(arr[k] + " ");
		}*/
		for (int k=j;k<arr.length;k++) {
			arr[k]=0;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");

	}
	}
}
