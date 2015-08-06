package edu.learn.test.controller;


import java.io.IOException;

import java.io.PrintWriter;

import java.util.List;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import edu.java.test.beans.Employee;
import edu.java.test.dataaccessobject.EmployeeDAO;



/**
 * Servlet implementation class AddressBookDetails
 */
@WebServlet("/addressBookDetails")
public class AddressBookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Logger log = Logger.getLogger(AddressBookDetails.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressBookDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PropertyConfigurator.configure(this.getClass().getClassLoader()
				//.getResource("log4j.properties"));
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		//PrintWriter out = response.getWriter();  
		List<Employee> list= employeeDAO.getDetails();
		
	    
		if(request.getParameter("radios") != null) {
            if(request.getParameter("radios").equals("Get address Book Details in csv")) {
            	
            	String fileName = System.getProperty("user.home")+"/employee.csv";

            	int status=WriteToCsv.writeCsvFile(fileName,list);
            	if(status==1)
            	{
            		PrintWriter out = response.getWriter();
        			out.println("CSv file created");
            		RequestDispatcher requestDispatcher = request
        					.getRequestDispatcher("/adminaccessibledetail.jsp");
        			requestDispatcher.include(request, response);
            	}
            	        }
            	
            	    

	   
//            if(request.getParameter("radios").equals("Get address Book Details in pdf")) {
//            	Document document = new Document();
//                try
//                {
//                   PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("employee.pdf"));
//                   for (Employee employee : list) {
//                   document.open();
//                   document.add(new Paragraph(employee.toString));
//                   document.close();
//                   writer.close();
//                } catch (DocumentException e)
//                {
//                   e.printStackTrace();
//                } catch (FileNotFoundException e)
//                {
//                   e.printStackTrace();
//                }   
//            }
		
	}
	}
}
		


