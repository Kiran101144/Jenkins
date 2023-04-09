package TestGETSET;

import org.junit.Test;

public class TestC {
	@Test
	public void main() {
		TestData a = new TestData();
		TestDataB b = new TestDataB();
		b.test(a.testData());
	}
}
