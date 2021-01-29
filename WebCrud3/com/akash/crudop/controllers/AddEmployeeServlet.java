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
 * Servlet implementation class EmployeeListServlet
 */
@WebServlet("/AddServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddEmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  RequestDispatcher rd = request.getRequestDispatcher("addEmployee.jsp");
		  request.setAttribute("listView", new DBOperations().showListEmployee());
		  rd.forward(request, response);
		 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("anvklsnd "+request.getParameter("eid"));
		Integer eid = Integer.parseInt((String)request.getParameter("eid"));
		String ename = (String)request.getParameter("ename");
		Integer esalary = Integer.parseInt((String)request.getParameter("esalary"));
		new DBOperations().saveEmployee(new Employee(eid,ename,esalary));
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("listView", new DBOperations().showListEmployee());
		rd.forward(request, response);
	}

}
