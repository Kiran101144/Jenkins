package ObjectAsParameter;

public class CReturnObjectMain {
	public static void main(String[] args) {
		CReturningObject c=new CReturningObject(5);
		System.out.println(c.i);
		CReturningObject c1;
		 c1=c.incrByTen();
		 System.out.println(c1.i);
		 c1=c1.incrByTen();
		 System.out.println(c1.i);
	}

}
