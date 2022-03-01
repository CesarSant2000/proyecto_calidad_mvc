package controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.TicketDAO;
import modelo.entidades.Ticket;
import modelo.entidades.Usuario;

@WebServlet("/UListarTicketController")
public class UListarTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UListarTicketController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.toString());
		int usuarioActual = (int)request.getSession().getAttribute("usuarioID");
		ArrayList<Ticket> allTickets = TicketDAO.getTickets(usuarioActual);
		request.setAttribute("tickets", allTickets);
		request.setAttribute("elUsuario", usuarioActual);
		request.getRequestDispatcher("jsp/Usuario/UListarTicket.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
