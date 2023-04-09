package Arrays;

public class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = arr[high];
			int i = (low - 1);
			// int i=-1;
			for (int j = low; j <= high - 1; j++) {
				if (arr[j] < pivot) {
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i + 1, high);
			quickSort(arr, low, (i + 1) - 1);
			quickSort(arr, (i + 1) + 1, high);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
