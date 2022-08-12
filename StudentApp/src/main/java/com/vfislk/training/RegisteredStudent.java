package com.vfislk.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteredStudent
 */
@WebServlet("/register")
public class RegisteredStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisteredStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	PrintWriter out =response.getWriter();
		String name =request.getParameter("name");
		String city=request.getParameter("city");
		String id=request.getParameter("studentId");
		int sid =Integer.parseInt(id);
		String language= request.getParameter("language");
		String hobbies[]=request.getParameterValues("hobby");
		
		
		out.print("<html><body>");
		out.print("Welcome, Student name "+name);
		out.print(" Student Id "+sid);
		out.print(" Student belongs to city "+city);
		out.print(" Student Language "+language);
		Stream.of(hobbies).forEach(out::print);
		out.print("<body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
