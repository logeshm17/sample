package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class check extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int seat=(int)req.getAttribute("send");
		PrintWriter out=res.getWriter();
		if(seat==5||seat==6)
		{
		out.println(  "No seat available");	
		}
		else
		{
		out.println(  "Your seat is booked");		
		}
		
	}
}
