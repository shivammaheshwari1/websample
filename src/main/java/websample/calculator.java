package websample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class calculator extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String firstint = request.getParameter("first");  //first int
		String secondint = request.getParameter("second"); //second int
		int sum = Integer.parseInt(firstint) + Integer.parseInt(secondint); //doing sum
		out.println("<a href='index.jsp'>Go to Input Page</a><br><br>");
		out.println("<labal id='result'>Sum is " + sum + "</label>");
		
		
	}
}
