package Strings;

public class ReverseAWord {
	public static void main(String[] args) {
		String str[]="i love programming very much".split(" ");
		String temp="";
		for(int i=str.length;i>=0;i--) {
			
			temp +=str[i] + " ";
		}
		System.out.println(temp);
	}
}
