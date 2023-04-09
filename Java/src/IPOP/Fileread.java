package IPOP;

import java.io.FileInputStream;


public class Fileread {

	public static void main(String [] args) {
		byt();
		//string();
	}
	public static void byt() {
		try {
		FileInputStream fo=new FileInputStream("E:\\jenkins\\Jenkins\\Java\\src\\Testing.txt");
		int i=fo.read();
		System.out.println("success....." +(char)i);
		fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void string() {
		try {
		FileInputStream fo=new FileInputStream("E:\\jenkins\\Jenkins\\Java\\src\\Testing.txt");
		int i=0;    
        while((i=fo.read())!=-1){    
         System.out.print((char)i);    
        }    		
		fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
