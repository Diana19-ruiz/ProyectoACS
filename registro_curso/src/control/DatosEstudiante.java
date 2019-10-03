package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatosEstudiante
 */
@WebServlet("/datosestudiante")
public class DatosEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatosEstudiante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Login</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<BR>");
		out.println("<BR>Please enter your user name and password.");
		out.println("<BR><FORM METHOD=POST action\"/registro_curso/mostrardatos\">");
		out.println("<BR>Nombre: <INPUT TYPE=TEXT NAME=nombre>");
		out.println("<BR>Direccion: <INPUT TYPE=TEXT NAME=direccion>");
		out.println("<BR>Edad: <INPUT TYPE=TEXT NAME=edad>");
		out.println("<BR>Genero: <INPUT TYPE=TEXT NAME=genero>");
		out.println("<BR><INPUT TYPE=SUBMIT VALUE=Envíar>");
		out.println("</FORM>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}
}
