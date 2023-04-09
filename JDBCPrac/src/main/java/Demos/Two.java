package Demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Two {
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
		ps.setInt(1, 7);
		ps.setString(2, "Deepak");
		ps.setString(3, "Ten");
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
			System.out.print(rs.getInt("Roll_No"));
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Class"));
		}
		connection.close();
	}

}
