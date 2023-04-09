package ObjectAsParameter;

public class BBoxCode {
	int h, w, b;

	BBoxCode() {
		 h = 1;
		 w = 2;
		 b = 3;
	}

	BBoxCode(int i, int j, int k) {
		 h = i;
		 w = j;
		 b = k;
	}

	BBoxCode(BBoxCode o) {
		 h = o.h;
		 w = o.w;
		 b = o.b;
	}

	public boolean testAllsidesEqual(BBoxCode o) {

		if (o.h == h && o.w == w && o.b == b) {
			return true;
		} else {
			return false;
		}
	}
}
