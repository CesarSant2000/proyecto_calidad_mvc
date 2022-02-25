package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.*;
import modelo.entidades.Usuario;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		Usuario usuarioAutenticado = UsuarioDAO.autenticar(usuario, password);
		if(usuarioAutenticado != null) {
			HttpSession session = request.getSession(true);
			switch(usuarioAutenticado.getTipoUsuario()) {
			case "U":
				session.setAttribute("usuario",usuarioAutenticado); 
				response.sendRedirect("UListarTicketController");
				break;
			case "D":
				session.setAttribute("usuario",usuarioAutenticado); 
				response.sendRedirect("DListarTicketController");
				break;
			default:
				session.invalidate(); 
				request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
				break;
			
			}
		}
		else {
			request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
	}

}