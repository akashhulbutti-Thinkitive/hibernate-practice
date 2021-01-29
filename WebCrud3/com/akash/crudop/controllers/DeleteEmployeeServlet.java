package com.akash.crudop.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akash.crudop.connection.DBOperations;
import com.akash.crudop.model.Employee;

/**
 * Servlet implementation class DeleteEmployeeServlet
 */
@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteEmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Delete get ID: " + request.getAttribute("deleteId"));
		RequestDispatcher rd = request.getRequestDispatcher("deleteEmployee.jsp");
		request.setAttribute("employee", new DBOperations().getEmployeeForId(1));
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int eid = Integer.parseInt((String)request.getParameter("eid"));
		String ename = (String)request.getParameter("ename");
		int esalary = Integer.parseInt((String)request.getParameter("esalary"));
		new DBOperations().saveEmployee(new Employee(eid,ename,esalary));
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("listView", new DBOperations().showListEmployee());
		rd.forward(request, response);

		/*
		 * int eid = Integer.parseInt((String)request.getAttribute("eid")); //
		 * RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); //
		 * request.setAttribute("employee",new DBOperations().getEmployeeForId(eid)); //
		 * rd.forward(request, response); }
		 */

	}
}
