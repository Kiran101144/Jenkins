package Strings;

public class ReverseASentence2 {
public static void main(String[] args) {
	String a=" saikiran deepak charan sweety    divya pradeep bunty nani lilly ";
	String s=a.trim();
	System.out.println(reverse(s));
}
public static String reverse(String s) {
	
	String [] wordARR=s.trim().split("\\s+");
	String rev="";
	for(int i=0;i<wordARR.length;i++) {		
		rev=rev+reverseWord(wordARR[i])+" ";
	}
//	for(String word :wordARR) {
//		rev=rev+reverseWord(word)+" ";
//	}
	return rev.trim();
}
public static String reverseWord(String word) {
	String revWord="";
	for(int i=word.length()-1;i>=0;i--) {
		revWord=revWord+word.charAt(i);
	}
	return revWord;
	
}
}
