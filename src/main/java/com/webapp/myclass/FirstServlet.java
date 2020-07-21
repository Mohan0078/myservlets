package com.webapp.myclass;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.myclass.dao.databaseDAO;
import com.webapp.myclass.model.fetch_from_database;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name = request.getParameter("name");
	
	databaseDAO user_data = new databaseDAO();
	
	databaseDAO dao = new databaseDAO(); 
			
	fetch_from_database data = dao.getData(name);
	
	request.setAttribute("data", data);
	
	RequestDispatcher rd = request.getRequestDispatcher("showData.jsp");
	rd.forward(request, response);
	
	
	}



}
