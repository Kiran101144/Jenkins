package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class One {
	public static void main(String args[]) {
		One o = new One();
		//o.Hashset();
		o.Treeset();
	}

	public void Hashset() {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");

//	Iterator<String> ite = set.iterator();
//	while (i.hasNext()) {
//		System.out.println(i.next());
//		int hash=set.hashCode();
//		System.out.println(hash);
//	}
		List<String> li = new ArrayList<String>(set);
		for (int i = 0; i < set.size(); i++) {
			String s = li.get(i);
			int hash = s.hashCode();
			System.out.println(li.get(i) + " = " + hash);
		}
	}

	public void Treeset() {
		
			 
			  TreeSet<String> al=new TreeSet<String>();
			  al.add("Ravi");
			  al.add("Vijay");
			  al.add("Ravi");
			  al.add("Sai");
			  al.add("Ajay");

			  Iterator<String> itr=al.iterator();
			  while(itr.hasNext()){
			   System.out.println(itr.next());
			  }
			System.out.println("Reverse" + al.descendingSet());
			System.out.println("Head" + al.headSet("Ravi",true));
			System.out.println("Tail" + al.tailSet("Sai",false));
			System.out.print("Sun" + al.subSet("Ravi", "Ajay"));
			System.out.print("Sun" + al.subSet("Ravi", true, "Sai", true));

			 }

}
