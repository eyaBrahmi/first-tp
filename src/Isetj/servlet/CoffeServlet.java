package Isetj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoffeServlet
 */
@WebServlet("/CoffeServlet")
public class CoffeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CoffeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typerem=request.getParameter("typerem");
		String text=request.getParameter("text");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title>Cofee shop</title></head>");
		out.println("<body> <img src='C:\\Users\\user\\Desktop\\coffee.jpg' height='300' width='200'>");
		out.println("<p>Merci de nous avoir hait pavenir la remarque suivante concernant </p>");
		out.println("<b>"+typerem+"</b>");
		out.println("<p>"+text);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
