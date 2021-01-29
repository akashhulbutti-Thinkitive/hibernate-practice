package com.akash.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.akash.connections.DictionaryOperations;

/**
 * Servlet implementation class AddWordServlet
 */
@WebServlet("/AddWordServlet")
public class AddWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddWordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String word = request.getParameter("word");
		String meaing = request.getParameter("meaning");
		new DictionaryOperations().saveWord(word,meaing);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("list",new DictionaryOperations().getAllWords());
		rd.forward(request, response);
	}

}
