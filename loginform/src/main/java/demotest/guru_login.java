package demotest;
 
import java.io.IOException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 * Servlet implementation class guru_login
 */
public class guru_login extends HttpServlet {
 
    public guru_login() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		 ServletConfig config=getServletConfig();  
		    String driver=config.getInitParameter("driver");  
		System.out.println("Driver is: "+driver);
		
		String n=request.getParameter("userName");  
        System.out.println("Welcome "+n); 
		
		ServletContext context=getServletContext(); 
		 HttpSession session=request.getSession();  
	        session.setAttribute("uname",n); 
		  
		//Getting the value of the initialization parameter and printing it  
		String driverName=context.getInitParameter("dname");  
		System.out.println("driver name is="+driverName);  
		
		if(username.isEmpty() || password.isEmpty() )
		{
			RequestDispatcher req = request.getRequestDispatcher("register_3.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("register_4.jsp");
			req.forward(request, response);
		}
	}
 
}