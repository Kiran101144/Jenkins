package Strings;

import java.util.ArrayList;

public class RepeatedCharCount {
	public static void main(String[] args) {
		String s = "saikiran deppak vamshi charan sweety";
		int s1 = s.length();
		int count = 0;

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			for (int j = 0; j < s.length() ; j++) {

				if (c !=  s.charAt(j) ) {
					continue;
				}
				count = count + 1;
			}
			if (!list.contains(c)) {
				if (count > 1 && c != ' ') {
					System.out.println(c + " " + count);
					list.add(c);
				}
			}
			count = 0;
		}

	}
}
