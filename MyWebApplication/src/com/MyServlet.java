package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    /*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Hello World, Service Method");
	}
	*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String input=request.getParameter("finput");
		if (input.equals(null) || input.equals("")) {
			out.print("Error, no input detected" + input);
		}
		else {
			Book b1 = new Book(input);
			
			if (b1.getTitle() == null) {
				out.print("<h3>BookID: " + input + "</h3>");
				out.print("<p>No Match Found</p>");
			}
			else {
				out.print("<h3>BookID: " + input + "</h3>");
				out.print("<br /><table style=\"width:100%\"   ><tr><th>Title</th><th>Author</th><th>Price</th><th>InStock</th></tr>");
				out.print("<tr><th>" + b1.getTitle() + "</th><th>" + b1.getAuthor() + "</th><th>$ " + b1.getPrice() +"</th><th>" + b1.getInStock() + "</th></table>");
			}
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name=request.getParameter("fname");
		out.print("Hello World, doPost Method");
		out.print("<br /> Hello " + name);
	}*/

}
