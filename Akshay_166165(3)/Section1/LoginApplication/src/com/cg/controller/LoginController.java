package com.cg.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.LoginBean;
import com.cg.exception.UserDefinedException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginBean loginBean=new LoginBean();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		
		
		
		loginBean.setName(request.getParameter("name"));
		loginBean.setPassword(request.getParameter("pass"));
		
	     LocalDate local=LocalDate.now();
		
		
		try {
			
			if(name.equals(loginBean.getName()) && pass.equals(loginBean.getPassword())) {
				HttpSession session=request.getSession(true);
				
				request.setAttribute("Name", name);
				request.setAttribute("date", local);
				session.setAttribute("login", loginBean);
				request.getRequestDispatcher("Success.jsp").forward(request,response);
				
				
			}
			else {
				
				throw new UserDefinedException("Login Failed");
			}
		}
		catch(UserDefinedException e)
		{
			System.out.println(e);
			
			
		}
		
		
				
	}

}
