package ObjectAsParameter;

public class CReturningObject {
	int i;
	CReturningObject(int a) {
		i = a;
	}
	CReturningObject incrByTen() {
		CReturningObject temp = new CReturningObject(i + 10);
		return temp;
	}

}
