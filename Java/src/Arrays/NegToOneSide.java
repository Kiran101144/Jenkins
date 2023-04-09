package Arrays;

public class NegToOneSide {

	public static void main(String[] args) {
		int[] arr = { 0, -2, 1, 5, 4, -9, 5, 0, -1, 54, 0, 0, -54, -5 };
		for (int i = 0; i < arr.length; i++) {
			int k = 0, count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[0] == 0) {
					for (int h = 0; h < arr.length; h++) {
						if (arr[h] < 0) {
							swap(arr, j, h);
						}
					}
				}
				if (arr[j] == 0) {
					if (count == 0) {
						swap(arr, k, j);
						count++;
					} else {
						swap(arr, k + 1, j);
						k++;
					}
				} else if (arr[j] < 0) {
					swap(arr, k, j);
					k++;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void swap(int arr[], int k, int j) {
		int temp = arr[k];
		arr[k] = arr[j];
		arr[j] = temp;
	}
}
