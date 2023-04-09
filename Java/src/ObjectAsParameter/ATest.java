package ObjectAsParameter;

public class ATest {
	int a, b;

	// Constructor
	ATest(int i, int j) {
		this.a = i;
		this.b = j;
	}

	// Method
	boolean equalTo(ATest o) {
		if (o.a == a && o.b == b) {
			return true;
		} else {
			return false;
		}
	}
}