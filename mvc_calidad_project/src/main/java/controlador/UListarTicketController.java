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

@WebServlet("/UListarTicketController")
public class UListarTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UListarTicketController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int usuarioActual = (int)request.getSession().getAttribute("usuarioID");
			ArrayList<Ticket> allTickets = TicketDAO.getTickets(usuarioActual);
			request.setAttribute("tickets", allTickets);
			request.setAttribute("elUsuario", usuarioActual);
			request.getRequestDispatcher("jsp/Usuario/UListarTicket.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doGet(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
