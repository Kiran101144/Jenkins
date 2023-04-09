package IPOP;

import java.io.FileOutputStream;

public class Fileout {

	public static void main(String [] args) {
		byt();
		//string();
	}
	public static void byt() {
		try {
		FileOutputStream fo=new FileOutputStream("E:\\jenkins\\Jenkins\\Java\\src\\Testing.txt");
		for(int i=65 ; i<=90;i++) {
		fo.write(i);
		}
		for(int i=97;i<=122;i++) {
			fo.write(i);
		}
		fo.close();
		System.out.println("success.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void string() {
		try {
		FileOutputStream fo=new FileOutputStream("E:\\jenkins\\Jenkins\\Java\\src\\Testing.txt");
		String s="Sai Kiran";
		byte b[]= s.getBytes();
		fo.write(b);
		fo.close();
		System.out.println("success.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
