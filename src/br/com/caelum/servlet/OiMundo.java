/**
 * 
 */
package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author user Aug 9, 2016 11:28:36 AM fj21-agenda br.com.caelum.servlet 2016
 *
 */
public class OiMundo extends HttpServlet{
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(request, response);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Oi mundo servlet1!</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}

	
}
