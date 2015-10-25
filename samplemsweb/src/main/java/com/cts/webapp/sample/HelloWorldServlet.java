package com.cts.webapp.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class HelloWorldServlet extends HttpServlet {
	
//	private static final long serialVersionUID = 1031422249396784970L;
//
//	public void doGet(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		
//		resp.setContentType("text/html");
//		
//		PrintWriter out = resp.getWriter();
//		out.print("<h1> code updated Training docker .."+new java.util.Date()+"</h1>");
//		out.flush();
//		out.close();	}
//}


public class HelloWorldServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try
        {
        	response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        int a1= Integer.parseInt(request.getParameter("n1"));
        int a2= Integer.parseInt(request.getParameter("n2"));
        if(request.getParameter("r1")!=null)
        {
            out.println("<h1>Addition</h1>"+(a1+a2));
        }
        if(request.getParameter("r2")!=null)
        {
            out.println("<h1>Substraction</h1>"+(a1-a2));
        }
        if(request.getParameter("r3")!=null)
        {
            out.println("<h1>Multiplication</h1>"+(a1*a2));
        }if(request.getParameter("r1")!=null)
        {
            out.println("<h1>Division</h1>"+(a1/a2));
        }
        }
        catch(Exception e)
        {

        }
    }
}
