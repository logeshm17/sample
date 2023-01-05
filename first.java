package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class cls extends HttpServlet 
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{
	//String S=req.getParameter("name");
	int i=Integer.parseInt(req.getParameter("sno"));
//	PrintWriter out=res.getWriter();
//	out.println( "  "+"welcome");
	req.setAttribute("send",i);
	RequestDispatcher rd=req.getRequestDispatcher("dear");
	rd.forward(req,res);
}
}
