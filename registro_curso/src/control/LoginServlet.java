package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendLoginForm(response, false);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("nombre");
		String password = request.getParameter("contraseña");
		if (userName != null && password != null &&
		userName.equals("jamesb") && password.equals("007")) {
		RequestDispatcher despachador = request.getRequestDispatcher("/datosestudiante");
		despachador.forward(request, response);
		}
		else {
		sendLoginForm(response, true);
		}
	}
	private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage)
			throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<TITLE>Login</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			if (withErrorMessage)
				out.println("El ACCESO falló. Inténtelo otra vez.<BR>");
			out.println("<BR>");
			out.println("<BR>Please enter your user name and password.");
			out.println("<BR><FORM METHOD=POST>");
			out.println("<BR>User Name: <INPUT TYPE=TEXT NAME=nombre>");
			out.println("<BR>Password: <INPUT TYPE=PASSWORD NAME=contraseña>");
			out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit>");
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}
}
