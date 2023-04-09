package Arrays;

public class RepeatingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 3, 6, 1 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (i != j) {
					if (arr[i] == arr[j]) {

						count = count + 1;
					}
				}
			}
			if (count > 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
