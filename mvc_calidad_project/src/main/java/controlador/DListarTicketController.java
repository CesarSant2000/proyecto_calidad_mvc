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

@WebServlet("/DListarTicketController")
public class DListarTicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DListarTicketController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Ticket> allTickets = TicketDAO.getTickets();
		request.setAttribute("tickets", allTickets);
		request.getRequestDispatcher("jsp/Desarrollador/DListarTickets.jsp").forward(request, response);
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
