package com.uttara.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServelet
 * http://localhost:8080/DateApp/getTodayDate
 */
public class DateServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DateServelet() {
		// TODO Auto-generated constructor stub
		System.out.println("The no arg constructor is called");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in------> DS----doGet()");

		// apply Bussiness Logic to create current date and time
		// generate html dy resource
		// write res into response body

		String[] quoteStrings = { "To be or not be ,today is good day", "happy day", "holiday is needed" };
		
		//This is the dynamic resource 
		Date dt = new Date();

		String html = "<html><body><h1>Date & Time</h1><b> Todays date and time is " + dt.toString()
				+ "</b> <br/> Quote of the day" + quoteStrings[(int) (Math.random() * quoteStrings.length)]
				+ "</body></html>";
		
		//Write the output to resource		
		PrintWriter p = response.getWriter();
		p.write(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
