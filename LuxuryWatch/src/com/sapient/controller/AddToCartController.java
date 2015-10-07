package com.sapient.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.model.Cart;

/**
 * Servlet implementation class AddToCartController
 */
public class AddToCartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCartController() {
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
		
		String name =  request.getParameter("item_name");
		String price=request.getParameter("item_price");
		String source=request.getParameter("item_source");
		Cart cart = new Cart();
		cart.setName(name);
		cart.setPrice(price);
		cart.setSource(source);
		/*request.setAttribute("name", name);
		request.setAttribute("price", price);
		request.setAttribute("source", source);*/
		 request.setAttribute("cartBean", cart);
			request.getRequestDispatcher("checkout.jsp").forward(request, response);
		
		
		
		
	}

}
