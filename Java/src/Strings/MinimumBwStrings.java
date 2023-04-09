package Strings;

public class MinimumBwStrings {
	public static void main(String[] args) {
		String[] str = { "the", "quick", "brown","the3", "fox", "quick" };
		System.out.println(distance(str));
	}

	static int distance(String[] s) {
		int diff = 0;
		String first = "the";
		String second = "fox";
		for (int i = 0; i < s.length; i++) {
			diff++;
			if (s[i] == first) {
				diff = 0;
			} else if (s[i] == second) {
				return diff;
			}
		}

		return diff;

	}
}
