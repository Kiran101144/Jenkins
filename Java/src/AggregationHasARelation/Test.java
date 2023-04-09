package AggregationHasARelation;

public class Test {
	int clas;
	String state;
	Student studen;
	public Test(Student studen, String state, int clas) {
		this.state = state;
		this.clas = clas;
		this.studen = studen;
	}
	public void display() {
		System.out.println(clas + " " + state + " " + studen.city + " " + studen.name + " " + studen.rollNo+" "+ studen.town);
	}
	public static void main(String[] args) {
		Student s = new Student(456, "saikiran", "Sangareddy", "HYD");
		Test t = new Test(s,"TG",10);		
		t.display();
	}
}
