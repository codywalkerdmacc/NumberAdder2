package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberAdder;

/**
 * Servlet implementation class getNumbersServlet
 */
@WebServlet("/getNumbersServlet")
public class getNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber1 = request.getParameter("userNumber1");
		String userNumber2 = request.getParameter("userNumber2");
		String userNumber3 = request.getParameter("userNumber3");
		
		NumberAdder userNumbers = new NumberAdder(Integer.parseInt(userNumber1), Integer.parseInt(userNumber2), Integer.parseInt(userNumber3));
		
		request.setAttribute("userNumbersHolder", userNumbers);
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
