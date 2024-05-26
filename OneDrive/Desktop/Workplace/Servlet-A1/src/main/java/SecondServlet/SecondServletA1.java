package SecondServlet;

import java.io.*;
import javax.servlet.*;


public class SecondServletA1 extends GenericServlet 
{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		System.out.println("Second servlet running.....");
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter(); 
		
		out.print("<html><body>");  
		out.print("<h2>Hello from Generic Servlet</h2>");
		java.util.Date date=new java.util.Date();
		out.print("<h2>Current Date and Time : "+date.toString()+"</h2>");
		out.print("</body></html>");  		
	}
	
}
