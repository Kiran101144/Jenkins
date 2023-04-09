package Arrays;

public class SumOfPairs {
	static int count;

	public static void main(String[] args) {
		int arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
		int sum = 11;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i != j) {
					int res = arr[i] + arr[j];
					if (sum == res) {
						count = count + 1;
					}
				}
			}
		}
		System.out.println(count);

	}
}
