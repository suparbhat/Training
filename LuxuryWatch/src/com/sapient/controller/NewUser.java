package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.model.NewLogin;

/**
 * Servlet implementation class NewUser
 */
public class NewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname =  request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email =  request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password =  request.getParameter("password");
		String retype = request.getParameter("retype");
		NewLogin user= new NewLogin();
			boolean status = user.validateNewUser(fname, lname, email, mobile, password);
			
			if(status){
				HttpSession session = request.getSession();
				session.setAttribute("email", email);
			    session.setAttribute("userBean", user);
			    if(password.equals(retype)){
					request.getRequestDispatcher("checkout.jsp").forward(request, response);
				
			}
			}
			else
			{ 
				response.sendRedirect("#");
				
			}
		}
	}


