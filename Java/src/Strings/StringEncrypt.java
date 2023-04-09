package Strings;

public class StringEncrypt {

	static String convertToHex(int num) {

		StringBuilder temp = new StringBuilder();
		while (num != 0) {
			int rem = num % 16;
			char c;
			if (rem < 10) {
				c = (char) (rem + 48);
			} else {
				c = (char) (rem + 87);
			}
			temp.append(c);
			num = num / 16;
		}

		return temp.toString();
	}

	// Function to encrypt the string
	static String encryptString(String S, int N) {

		StringBuilder ans = new StringBuilder();

		// Iterate the characters
		// of the string
		for (int i = 0; i < N; i++) {

			char ch = S.charAt(i);
			int count = 0;
			String hex;

			// Iterate until S[i] is equal to ch
			while (i < N && S.charAt(i) == ch) {

				// Update count and i
				count++;
				i++;
			}

			// Decrement i by 1
			i--;

			// Convert count to hexadecimal
			// representation
			hex = convertToHex(count);


			ans.append(ch);

			ans.append(hex);
		}

		ans.reverse();

		return ans.toString();
	}

	public static void main(String[] args) {

		String S = "abc";
		int N = S.length();

		System.out.println(encryptString(S, N));
	}
}
