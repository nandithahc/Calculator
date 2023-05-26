package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/add") //mandatory to put forward  slash(/)
public class Addition implements Servlet {

	
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
				int num1=Integer.parseInt(req.getParameter("number1"));
				int num2=Integer.parseInt(req.getParameter("number2"));
				res.getWriter().print("<h1 style='color:blue'>The sum of "+num1+" and "+num2+" is "+(num1+num2)+"</h1>");
				
				
	}

}
