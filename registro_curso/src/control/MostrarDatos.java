package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metodo.Estudiante;
import metodo.Excepcion;

/**
 * Servlet implementation class MostrarDatos
 */
@WebServlet("/mostrardatos")
public class MostrarDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatos() {
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
		Estudiante estudiante = new Estudiante();
		try {
			estudiante.setNombre(request.getParameter("nombre"));
			estudiante.setDireccion(request.getParameter("direccion"));
			estudiante.setGenero(request.getParameter("genero"));
			estudiante.setEdad(Integer.parseInt(request.getParameter("edad")));
			
			PrintWriter out;
			out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<TITLE>Datos Personales</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			out.println("<BR>");
			out.println("<BR><FORM METHOD=\"get\">");
			out.println("<BR>Nombre: "+estudiante.getNombre());
			out.println("<BR>Direccion: "+estudiante.getDireccion());
			out.println("<BR>Edad: "+estudiante.getEdad());
			out.println("<BR>Genero: "+estudiante.getGenero());
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}catch(Excepcion e) {
			PrintWriter out;
			out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<TITLE>Datos Personales</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			out.println("<BR>");
			out.println("Error"+e.getMessage());
			out.println("<BR>Genero: "+estudiante.getGenero());
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		    
		}
	}
}
