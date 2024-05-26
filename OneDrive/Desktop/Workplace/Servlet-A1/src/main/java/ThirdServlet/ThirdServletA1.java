package ThirdServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServletA1 extends HttpServlet
{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		 
		out.print("<h2>Hello from HTTP Servlet</h2>");
		
		String str1=req.getParameter("num1");
		String str2=req.getParameter("num2");
		
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		
		int result=n1+n2;
		
		out.print("<h2>Addition of "+n1+" & "+n2+" is "+result+"<h2>");
		
	}
}