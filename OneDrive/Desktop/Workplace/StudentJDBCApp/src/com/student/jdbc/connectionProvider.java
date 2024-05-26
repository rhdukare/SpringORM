package com.student.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvider {
	
	static Connection con;
	
	public static Connection createC() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/student_jdbc";
			
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
