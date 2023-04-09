package Arrays;

public class SubArraySum {
	static int sum ;
	public static void main(String[] args) {
		int num = 9;
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				//System.out.println(sum);
				if (sum == num) {
					System.out.println(i + " to " + j);
					break;
				}

			}
			sum=0;
		}
	}
}
