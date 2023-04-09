package Arrays;

public class LargestSubArray {

	public static void main(String[] args) {

		int arr[] = { 6, -3, -10, 0, 2};
		int a = Sum(arr, arr.length);
		System.out.println("Sum "+a);
		int b = Product(arr, arr.length);
		System.out.println("Product "+b);
	}

	public static int Sum(int arr[], int n) {
		int large = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum > large) {
					// System.out.println(i + " to " + j);
					large = sum;
				}
			}
		}
		return large;
	}
	public static int Product(int arr[],int n) {
		int large = 1;
		for (int i = 0; i < n; i++) {
			int sum = 1;

			for (int j = i; j < n; j++) {
				sum = sum * arr[j];
				if (sum > large) {
					// System.out.println(i + " to " + j);
					large = sum;
				}
			}
		}
		return large;
	}
	}

