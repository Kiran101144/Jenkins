package Strings;

public class NoOfWordsInASentane {
public static void main(String[] args) {
	
	String a=" saikiran deepak charan sweety    divya pradeep bunty nani lilly ";
	reverse(a);
}
public static void reverse(String a) {
	
	String s=a.trim();
	int len=s.length();
	int count=0;
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
			count = count+1;
			 
		}
//		else if(s.charAt(i)==' '&& s.charAt(i+1)==' ') {
//			i++;
//		}
		else if(i==len-1) {
			count =count+1;
		}
		
	}
	System.out.println(count);
	
	
}
}
