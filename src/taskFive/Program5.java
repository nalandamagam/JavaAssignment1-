package taskFive;

public class Program5 {

	public static void main(String[] args) {
		int a[] = { 12, 44, 68, 90, 7 };
		int oddCount = 0, evenCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && evenCount == 1) {
				System.out.println(a[i]);
			} else if ((a[i] % 2) != 0 && oddCount == 1) {
				System.out.println(a[i]);
			}
		}

	}

}
