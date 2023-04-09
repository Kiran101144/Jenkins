package Arrays;

public class ReArrangeArray {

	void rightrotate(int arr[], int n, int outofplace, int cur) {
		int tmp = arr[cur];
		for (int i = cur; i > outofplace; i--) {
			arr[i] = arr[i - 1];
		}
		arr[outofplace] = tmp;
	}

	void rearrange(int arr[], int n) {
		int outofplace = -1;

		for (int i = 0; i < n; i++) {
			if (outofplace >= 0) {
				if (((arr[i] >= 0) && (arr[outofplace] < 0)) || ((arr[i] < 0) && (arr[outofplace] >= 0))) {
					rightrotate(arr, n, outofplace, i);

					if (i - outofplace >= 2)
						outofplace = outofplace + 2;
					else
						outofplace = -1;
				}
			}

			if (outofplace == -1) {
				if (((arr[i] >= 0) && ((i % 2) == 0)) || ((arr[i] < 0) && (i % 2) == 1))
					outofplace = i;
			}
			printArray( arr,n);
		}
	}

	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	// Driver Code
	public static void main(String[] args) {
		ReArrangeArray rearrange = new ReArrangeArray();

		int arr[] = { 5, -2, -5, 2, 4, 7, 1, 8, 0, -8 };
		int n = arr.length;

		System.out.println("Given array is ");
		rearrange.printArray(arr, n);

		rearrange.rearrange(arr, n);

		System.out.println("RearrangeD array is ");
		rearrange.printArray(arr, n);
	}
}
