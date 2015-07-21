package edu.javalearn.domain.online_shopping;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class productCount
 */
@WebServlet("/productCount")
public class ProductCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String category;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductCount() {
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
	
HttpSession session=request.getSession(false);
		
		//response.setContentType("text/html");
		
	}
		//session.getAttribute("Product");
		
		//pro=new LinkedList<ProductDetail>();
	
	public  ResultSet getResultSet(String s)
	{
		this.category=s;
		ResultSet rs=null;
		try{
			Connection connection=null;
			connection=Login.dbConnect();
			Statement  statement=null;
			String name;
			statement = connection.createStatement();
			 rs=statement.executeQuery("Select * from Products WHERE Category='"+category+"'");
			
	}
	
	catch(Exception e)
	{
		
	}
		return rs;
}
}