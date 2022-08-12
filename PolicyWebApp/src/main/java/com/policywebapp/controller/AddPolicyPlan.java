package com.policywebapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthapp.model.Plan;
import com.policywebapp.model.Policy;

/**
 * Servlet implementation class AddPolicyPlan
 */
@WebServlet("/AddPolicyPlan")
public class AddPolicyPlan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPolicyPlan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String policyName=request.getParameter("policyname");
		int 
		String category=request.getParameter("category");
		String brand=request.getParameter("brand");
		String coverage=request.getParameter("coverage");
		double sumInsured=Double.parseDouble(request.getParameter("sumInsured"));
		
	Policy policy =new Policy();
	policy.setPolicyName(policyName);
	policy.setPolicyNumber(policyNumber);
	policy.setPremium(premium);
	policy.setType(type);
	policy.setBrand(brand);
	policy.setDuration(duration);
	policy.setCategory(category);
	policy.setCoverage(coverage);
	policy.setSumAssured(sumAsssured);
		
		request.setAttribute("plan",plan);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
