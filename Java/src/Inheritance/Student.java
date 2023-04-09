package Inheritance;

public class Student {
	int rollNo;
	String name,town,city;
	String state;
 public  void student(int rollNo,String name,String town,String city) {
	 
	 this.rollNo=rollNo;
	 this.name=name;
	 this.town=town;
	 this.city=city;
	 
 }
 public void student(int rollNo,String name,String town,String city,String state) {
	 this.state=state;
	 System.out.println(rollNo+" "+name+" "+town+" "+city+" "+state);
 }
}
