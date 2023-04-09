package ObjectAsParameter;

public class BBoxTest {
	public static void main(String[] args) {
		BBoxCode b = new BBoxCode(11, 11, 11);
		BBoxCode b1 = new BBoxCode(b);
		BBoxCode b2 = new BBoxCode();
		System.out.println(b.b+" "+b.w+" "+b.h);
		System.out.println(b1.b+" "+b1.w+" "+b.h);
		System.out.println(b.testAllsidesEqual(b1));
		System.out.println(b.testAllsidesEqual(b2));
	}

}
