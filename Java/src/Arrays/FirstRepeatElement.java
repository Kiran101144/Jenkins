package Arrays;

import java.util.HashSet;

public class FirstRepeatElement {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 5, 3, 4, 6 };
		System.out.println(first(arr));
		System.out.println(second(arr));
	}


	public static int first(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] != arr[j]) {

						return i + 1;

					}
				}
			}

		}
		return -1;

	}

	public static int second(int arr[]) {
		int minIndex = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i = arr.length - 1; i >= 0; i--) {

			if (set.contains(arr[i])) {
				//minIndex = i + 1;
			}
			else {
				//set.add(arr[i]);
				minIndex = i + 1;
			}
		}
		return minIndex;
	}
}
