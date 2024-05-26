package com.student.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

public class StudentDao {
	
	public static boolean InsertStudentToDB(Student st) {
		
		boolean flag=false;
		try {
			
			//jdbc code....
			Connection con=connectionProvider.createC();
			String q="insert into student(sname,sphone,scity) values(?,?,?)";
			//prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setString(1,st.getStudentname());
			pstmt.setString(2,st.getStudentphone());
			pstmt.setString(3,st.getStudentcity());
			
			//execute...
			pstmt.executeUpdate();
			flag=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag;
	}

	public static boolean deletestudent(int userid) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			
			//jdbc code....
			Connection con=connectionProvider.createC();
			String q="delete from student where sid=?";
			//prepared statement
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value of parameter
			pstmt.setInt(1,userid);
			
			//execute...
			pstmt.executeUpdate();
			flag=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return flag;
	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		try {
			
			//jdbc code....
			Connection con=connectionProvider.createC();
			String q="select * from student";
			//statement
			java.sql.Statement stmt=con.createStatement();
			
			ResultSet set=stmt.executeQuery(q);
			
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone =set.getString(3);
				String city =set.getString("scity");
				
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Phone : "+phone);
				System.out.println("City : "+city);
				System.out.println("__________________________________");
		
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
