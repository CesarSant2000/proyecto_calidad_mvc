package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.TicketDAO;
import modelo.dao.UsuarioDAO;
import modelo.entidades.Ticket;
import modelo.entidades.Usuario;

@WebServlet("/UEditarTicketController")
public class UEditarTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UEditarTicketController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Ticket ticketAModificar = TicketDAO.getTicket(Integer.parseInt(request.getParameter("idTicket")));
			ArrayList<Usuario> desarrolladores = UsuarioDAO.getAllUsers();
			request.setAttribute("ticket", ticketAModificar);
			request.setAttribute("desarrolladores", desarrolladores);
			request.getRequestDispatcher("jsp/Usuario/UEditarTicket.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idTicket = Integer.parseInt(request.getParameter("idTicket"));
			String titulo = request.getParameter("titulo");
			String estado = request.getParameter("estado");
			String descripcion = request.getParameter("descripcion");
			String prioridad = request.getParameter("prioridad");
			int idUser = Integer.parseInt(request.getParameter("idUsuario"));
			int idDeveloper = Integer.parseInt(request.getParameter("encargado"));
			String observaciones = request.getParameter("observaciones");
			
			Ticket t = new Ticket(idTicket, titulo, estado, descripcion, prioridad, idUser, idDeveloper, observaciones);
			TicketDAO.actualizarTicketUsuario(t);
			response.sendRedirect("UListarTicketController");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
