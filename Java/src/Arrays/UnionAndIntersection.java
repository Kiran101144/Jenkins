package Arrays;

public class UnionAndIntersection {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 6, 4, 8, 7 };
		int arr2[] = { 7, 1, 3, 4, 9, 10 };
		union(arr1, arr2);
		System.out.println();
		intersection(arr1, arr2);
	}

	public static void union(int arr1[], int arr2[]) {
		int i = 0, j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i]);
				i++;
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j]);
				j++;
			} else {
				System.out.print(arr2[j]);
				i++;
				j++;
			}
		}
		while (i < arr1.length) {
//		System.out.println(arr1[i]);
//		i++;
			System.out.print(arr1[i++]);
		}
		while (j < arr2.length) {
			System.out.print(arr2[j++]);
		}
	}

	public static void intersection(int arr1[], int arr2[]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(" " + arr1[i]);
				}
			}
		}
	}
}
