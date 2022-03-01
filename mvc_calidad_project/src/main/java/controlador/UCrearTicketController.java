package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.TicketDAO;
import modelo.entidades.Ticket;

@WebServlet("/UCrearTicketController")
public class UCrearTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UCrearTicketController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int usuarioCreador = Integer.parseInt(request.getParameter("idUsuario"));
		request.setAttribute("idUsuario", usuarioCreador);
		request.getRequestDispatcher("jsp/Usuario/UCrearTicket.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String estado = "abierto";
		String descripcion = request.getParameter("descripcion");
		String prioridad = "";
		int idUser = Integer.parseInt(request.getParameter("idUsuario"));
		String observaciones = "";
		
		Ticket t = new Ticket(titulo, estado, descripcion, prioridad, idUser, observaciones);
		TicketDAO.crearTicket(t);
		response.sendRedirect("UListarTicketController");
	}

}
