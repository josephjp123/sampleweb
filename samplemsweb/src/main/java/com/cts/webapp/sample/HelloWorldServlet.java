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
        	
        	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h1 style="text_align=center">Calculator</h1>
<form method="get" action="/Servlet">
<label>first number:</label>
<input type="text" name="n1" />
<br />
<label>Second number : </label>
<input type="text" name="n2" />
<br />
 <div>
<label>
<input type="radio" name="r1" value="add" />addition
<br />
</label>
<input type="radio" name="r2" value="sub" />subtraction 
<br />
<input type="radio" name="r3" value="mul" />multiplication
<br />
<input type="radio" name="r4" value="div" />division
<br /> 
</div>
<input type="button" value="submit" />
</form>
</body>
</html>
        	
        	
        	
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
