import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.jdbc.Student;
import com.student.jdbc.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("Welcome to our java application for student");
			System.out.println("Press 1 to insert");
			System.out.println("Press 2 to delete");
			System.out.println("Press 3 to display");
			System.out.println("Press 4 to exit");
			int ch= Integer.parseInt(br.readLine());
			
			if (ch==1) 
			{//insert
				System.out.println("Enter student's name :");
				String name=br.readLine();
				
				System.out.println("Enter student's phone no. :");
				String ph=br.readLine();
				
				System.out.println("Enter student's city :");
				String ct=br.readLine();
				
				//create student
				Student st=new Student(name, ph, ct);
				boolean answer= StudentDao.InsertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student Successfully Added....");
				}else
				{
					System.out.println("something went wrong....");
				}
				System.out.println(st);
				
			}else if (ch==2) 
			{//delete
				System.out.println("Enter studentID to delete : ");
				int userid=Integer.parseInt(br.readLine());
				Boolean f= StudentDao.deletestudent(userid);
				if(f)
				{
					System.out.println("Deleted.....");
				}else
				{
					System.out.println("something went wrong....");
				}
				
			}else if (ch==3) 
			{//display
				StudentDao.showAllStudent();
			}else if (ch==4) 
			{//exit
				break;
			}else {
				
			}
		}
		System.out.println("Thank you.... ");
	}

}
