package Arrays;

public class ArrayRotation {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int n = 2;
		int[] b = rotateR(a, n);
		//int[] b = rotateL(a, n);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static int[] rotateR(int[] a, int n) {

		// System.out.println(last);
		for (int i = 0; i < n; i++) {
			int j, last;
			last = a[a.length - 1];
			for (j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		return a;
	}

	public static int[] rotateL(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int j, first;
			first = a[0];
			
			for (j = 0; j < a.length - 1; j++) {
				 a[j]=a[j + 1];
				
			}
			a[a.length-1] = first;
			
		}
		return a;
	}
}
