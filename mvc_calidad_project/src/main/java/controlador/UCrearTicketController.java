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
	private static final String STR_ID_USUARIO = "idUsuario";
       
    public UCrearTicketController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int usuarioCreador = Integer.parseInt(request.getParameter(STR_ID_USUARIO));
		request.setAttribute(STR_ID_USUARIO, usuarioCreador);
		request.getRequestDispatcher("jsp/Usuario/UCrearTicket.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String titulo = request.getParameter("titulo");
			String estado = "abierto";
			String descripcion = request.getParameter("descripcion");
			String prioridad = "";
			int idUser = Integer.parseInt(request.getParameter(STR_ID_USUARIO));
			String observaciones = "";
			
			Ticket t = new Ticket(titulo, estado, descripcion, prioridad, idUser, observaciones);
			TicketDAO.crearTicket(t);
			response.sendRedirect("UListarTicketController");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
