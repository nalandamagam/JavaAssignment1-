package taskFour;

public class Program11 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int i=0,l=a.length,j=l-1;
		while(i<j) {
			System.out.print(a[j] + " " + a[i]+ " ");
			i++;
			j--;
		}
		if(i==j) {
			System.out.print(a[i]);
		}
	}

}
