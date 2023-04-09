package Demos;

import java.io.*;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Three {
	static String URL = "jdbc:mysql://localhost:3306/school";
	static String user = "root";
	static String password = "Saikiran@800";

	public static void main(String[] args) {
		try {
			insert();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "insert into student(Roll_No,Name,Class) values(?,?,?)";
		Connection con = DriverManager.getConnection(URL, user, password);
		PreparedStatement ps = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("wnter rollno");
		int rollno = sc.nextInt();
		System.out.println("wnter name");
		String name = sc.next();
		System.out.println("Enter class");
		String clas = sc.next();

		ps.setInt(1, rollno);
		ps.setString(2, name);
		ps.setString(3, clas);
		ps.executeUpdate();
		con.close();
		read();
	}

	public static void read() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "select * from student order by Roll_No";
		Connection connection = DriverManager.getConnection(URL, user, password);
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println(rs.getInt("Roll_No"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Class"));
		}
		connection.close();
	}

}
