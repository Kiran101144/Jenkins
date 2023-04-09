package ObjectAsParameter;

public class AMain {
	public static void main(String[] args) {
		ATest ob1 = new ATest(7, 6);
		ATest ob2 = new ATest(7, 6);
		ATest ob3 = new ATest(-1, -1);
		System.out.println(ob1.equalTo(ob2));
		System.out.println(ob1.equalTo(ob3));

	}
}
