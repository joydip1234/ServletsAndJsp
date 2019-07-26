package com.db.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.service.LoginService;
import com.db.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		//two ways are there
		
		//1. requestdispatcher's forward method
		//2. sendredirect method
		
		
		RequestDispatcher dispatcher = null;
		LoginService loginservice = new LoginServiceImpl();
		LoginBean login =  new LoginBean(username, password);
		
		
		
		//if("admin".equals(username) && "admin".equals(password)) {
		//System.out.println(loginservice.authenticate(login));
		if(loginservice.authenticate(login)) {	
		
			dispatcher = request.getRequestDispatcher("adminHome.html");
			dispatcher.forward(request, response);
			
		}else {
			
			response.sendRedirect("login.html");
			
			
		}
	
	
	}

}
