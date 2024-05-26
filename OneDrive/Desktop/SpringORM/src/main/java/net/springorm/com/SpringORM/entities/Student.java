package net.springorm.com.SpringORM.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "Student_Details")
public class Student {
	@Id
	private int StudentID;
	private String StudentName;
	private String StudentCity;
    
	
	public Student(int studentID, String studentName, String studentCity) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentCity = studentCity;
	}

	public Student() {
		
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

}
