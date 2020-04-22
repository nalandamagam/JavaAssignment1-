package taskFour;
import java.util.Arrays;

public class Program5 {

	public static void main(String[] args) {
		int a[] = {1,0,4,0,23,0,12,45,9,6,0};
		int index=0;
		int l = a.length;
		for(int i=0;i<l;i++) {
			if (a[i] != 0){
				a[index++] = a[i];
			}
		}
		for(int i =index;i<l;i++) {
			a[i] = 0;
	}
		for(int i=0;i<l;i++) {
			System.out.print( a[i] + " ");
		}
	}
}
