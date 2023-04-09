package Strings;

public class Polindrome {
	public static void main(String[] args) {
//	polindrome();
		RotateLeft();
		System.out.println();
		RotateRight();
	}

	static void polindrome() {
		String s = "saiias";
		StringBuilder s1 = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			s1.append(c);
		}

		if (s.equalsIgnoreCase(s1.toString())) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	static void RotateLeft() {
		String s = "abcde";
		char[] a = s.toCharArray();
		for (int i = 0; i < 2; i++) {

			char last = a[a.length - 1];

			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

	static void RotateRight() {
		String s = "abcde";

		char[] a = s.toCharArray();
		for (int i = 0; i < 2; i++) {
			char first = a[0];

			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = first;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
