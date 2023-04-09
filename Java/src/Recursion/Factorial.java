package Recursion;

public class Factorial {
	public static void main(String[] args) {
		Factorial f=new Factorial();
System.out.println(f.fact(5));
	}

	public int fact(int n) {

		if (n == 1) {
			return 1;
		}
		int result = fact(n - 1) * n;
		System.out.println(n +" " +result);
		return result;
	}
}
