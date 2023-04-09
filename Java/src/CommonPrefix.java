import java.util.Arrays;

public class CommonPrefix {
	public String longestCommonPrefix(String[] a) {
		int size = a.length;

		if (size == 0)
			return "";

		if (size == 1)
			return a[0];

		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		/* find the minimum length from first and last string */
		int end = Math.min(a[0].length(), a[size - 1].length());

		/*
		 * find the common prefix between the first and last string
		 */
		int i = 0;
		while (i < end && a[0].charAt(i) == a[size - 1].charAt(i)) {
			//System.out.println(a[0]+ " "+ a[size - 1]);
			i++;
		}

		String pre = a[0].substring(0, i);
		return pre;
	}

	/* Driver Function to test other function */
	public static void main(String[] args) {
		CommonPrefix gfg = new CommonPrefix();
		String[] input = {  "geeksforgeeks", "geks", "geek", "geezer" };
		System.out.println("The longest Common Prefix is : " + gfg.longestCommonPrefix(input));
	}
}
