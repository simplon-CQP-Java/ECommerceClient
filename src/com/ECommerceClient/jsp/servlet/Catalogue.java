package com.ECommerceClient.jsp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import metier.Article;
import metier.ArticleService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Catalogue
 */
@WebServlet("/Catalogue")
public class Catalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogue() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private ArticleService service;
    
    public void init() {
    	service = new ArticleService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatch = request.getRequestDispatcher( "Catalogue.jsp" );
		dispatch.forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		// Set liste attribute
		ArrayList<Article> catalogue=service.getCatalogue();
		request.setAttribute("liste", catalogue);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("Catalogue.jsp");
		dispatch.forward( request, response );
	}

}
