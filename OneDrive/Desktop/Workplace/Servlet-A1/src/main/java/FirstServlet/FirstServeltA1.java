package FirstServlet;

import java.io.IOException;
import javax.servlet.*;


public class FirstServeltA1 implements Servlet
{
	public void init(ServletConfig cong)
	{
		System.out.println("servelt starting....");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet performing.....");
	}

	public void destroy() {
		System.out.println("servlet distroying....");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return "copy servlet info";
	}

	
}

