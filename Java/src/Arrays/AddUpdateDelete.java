package Arrays;

public class AddUpdateDelete {
	public static void main(String[] args) {
		int a[] = new int[5];
		add(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("==============================");
		// update(a);
		int[] b = delete(a);

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	}

	public static int[] add(int a[]) {

		int j = 10;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a.length) {
				a[i] = j;
				j = j + 5;
			}
		}
		return a;
	}

	public static int[] update(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 20) {
				a[i] = 25;
			}
			a[3] = 35;
		}
		return a;
	}

	public static int[] delete(int a[]) {
		int b[] = new int[a.length - 1];
		for (int i = 0, k = 0; i < a.length; i++) {
			if (a[i] != 30) {
				b[k] = a[i];
				k++;
			}
		}
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//		}
		return b;
	}
}