package Arrays;

import java.util.ArrayList;

public class CommonElementIn3Arrays {
	public static void main(String[] args) {
		int A[] = { 2, 3, 4, 4 };
		int B[] = { 1, 3, 4, 4 };
		int C[] = { 1, 3, 4, 4 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i = 0, j = 0, k = 0;
		int last = Integer.MIN_VALUE;

		while (i < A.length && j < B.length && k < C.length) {

			if (A[i] == B[j] && B[j] == C[k]) {

				if (last != A[i]) {
					arr.add(A[i]);
					last = A[i];
				}
				i++;
				j++;
				k++;
			} else if (A[i] < B[j]) {
				i++;
			} else if (B[j] < C[k]) {
				j++;
			} else {
				k++;
			}
		}
//		for (int a : arr) {
//			System.out.println(a);
//		}

		for (int x = 0; x < arr.size(); x++) {
			System.out.print(arr.get(x) + " ");
		}
	}
}
