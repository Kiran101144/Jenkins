package NestedClass;

public class Test {

	public static void test() {
		System.out.println("outer class");
	}
	class Inner{
		public void demo() {
			System.out.println("inner");
		}
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.test();
		Test.Inner i=t.new Inner();
		i.demo();
		
	}
}
