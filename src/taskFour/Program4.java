package taskFour;
import java.util.Arrays;

public class Program4 {

	public static void main(String[] args) {
		int arr1[][] = {{1,2},{1,2}};
		int arr2[][] = {{1,2},{1,2}};
		int res[][] = new int [2][2];	
		
		for (int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				res[i][j]= arr1[i][j] + arr2[i][j];
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
// work on printing the digits in particular order