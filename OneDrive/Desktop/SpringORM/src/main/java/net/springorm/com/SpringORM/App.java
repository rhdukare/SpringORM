package net.springorm.com.SpringORM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.springorm.com.SpringORM.dao.StudentDao;
import net.springorm.com.SpringORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        /*
        Student st=new Student(123,"Ritiket","Chandrapur");
        
        int i= studentDao.insert(st);
        
        System.out.println("Record inserted.."+i);
        */
        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(go) 
        {
        	System.out.println("Select 1 - Insert");
        	System.out.println("Select 2 - View a record");
        	System.out.println("Select 3 - View all record");
        	System.out.println("Select 4 - Delete");
        	//System.out.println("Select 5 - Update");
        	System.out.println("Select 5 - Exit");

        	Integer ch=Integer.parseInt(br.readLine());
        			
        	switch (ch) {
			case 1:
				System.out.println("Enter id - ");
				Integer i_id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter name - ");
				String i_name= br.readLine();
				
				System.out.println("Enter city - ");
				String i_college= br.readLine();
				
				Student i_std =new Student(i_id,i_name,i_college);
				
				int r=studentDao.insert(i_std);
				
				System.out.println("Record inserted successfully with id "+i_id);
				
				break;

			case 2:
				System.out.println("Enter id - ");
				Integer i_id1=Integer.parseInt(br.readLine());
				
				Student getstudent = studentDao.getstudent(i_id1);
				System.out.println("Student Id:"+getstudent.getStudentID());
				System.out.println("Student Name: "+getstudent.getStudentName());	
				System.out.println("Student City: "+getstudent.getStudentCity());
				System.out.println("___________________________________");
				
				break;
				
			case 3:
				
				List<Student> getallstudent = studentDao.getallstudent();
				for(Student st1:getallstudent)
				{
					System.out.println("Student Id:"+st1.getStudentID());
					System.out.println("Student Name: "+st1.getStudentName());
					System.out.println("Student City: "+st1.getStudentCity());
					System.out.println("___________________________________");
				}
				System.out.println("**************************");
				
				break;
				
			case 4:
				System.out.println("Enter Student ID :-");
				int userdeleteid=Integer.parseInt(br.readLine());
				studentDao.deletestudent(userdeleteid);
				System.out.println("Record Deleted.......");
	
				break;
	
			case 5:
					System.out.println("Thank you........");
					go=false;
				break;
				
			default:
				break;
			}
        }
    }
}
