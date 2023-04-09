package Arrays;

public class CountSubArrayWithZerosAndOne {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 1, 1 };
		//for (int i = 0; i < arr.length; i++) {
		int  i=0;
		int count = 0;
		while(i<arr.length) {
			int A = 0;
			int z = 0;
			for (int j = i; j < arr.length; j++) {

				if (arr[j] == 1) {
					A = A + 1;
				} else if (arr[j] == 0) {
					z = z + 1;
				}
				if (A == z) {
					count = count + 1;
					System.out.println(i+","+j);
				}
			}
			i=i+1;
		}
		
		System.out.println(count);
	}
}
