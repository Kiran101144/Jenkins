package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String str[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		// System.out.println(commonPrefix(str));
		System.out.println(prefix(str));
	}

	public static String commonPrefix(String str[]) {
		int size = str.length;
		if (size == 0) {
			return null;
		}
		if (size == 1) {
			return str[0];
		}
		// Arrays.sort(str);
		int end = Math.min(str[0].length(), str[size - 1].length());
		int i = 0;
		System.out.println(str[0].charAt(i));
		while (i < end && str[0].charAt(i) == str[size - 1].charAt(i)) {
			i++;
		}
		String pre = str[0].substring(0, i);
		return pre;

	}

	public static String prefix(String[] a) {
		int size = a.length;
		if (size == 0 || size == 1) {
			return "";
		}
		String prefix = a[0];
		for (int i = 1; i < size; i++) {
			while (a[i].indexOf(prefix) != 0) {
				System.out.println(a[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;

	}
}
