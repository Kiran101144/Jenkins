package Demos;

import java.sql.*;
import java.util.Scanner;

public class One {

	static String URL = "jdbc:mysql://localhost:3306/school";
	static String user = "root";
	static String password = "Saikiran@800";

	public static void main(String[] args) {
		try {
			connect();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void connect() throws Exception {
		System.out.println(" select condition 1= insert,2 = read, 3= update,4=delete");
		Scanner sc = new Scanner(System.in);
		int condition = sc.nextInt();

		switch (condition) {

		case 1:
			insert();
			break;
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		}

	}

	public static void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "insert into student values(7,'Dhoni','Ten');";
		Connection connection = DriverManager.getConnection(URL, user, password);
		Statement st = connection.createStatement();
		st.execute(query);
		connection.close();
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
			System.out.print("  ");
			System.out.println(rs.getString("Name"));
		}
		connection.close();
	}

	public static void update() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "update student set Name='Kiran' where Roll_No=7";
		Connection con = DriverManager.getConnection(URL, user, password);
		Statement st = con.createStatement();
		st.execute(query);
		con.close();
		read();
	}

	public static void delete() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "delete from student where Roll_No=7";
		Connection con = DriverManager.getConnection(URL, user, password);
		Statement st = con.createStatement();
		st.execute(query);
		con.close();
		read();

	}
}
