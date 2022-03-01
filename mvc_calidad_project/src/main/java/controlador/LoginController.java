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
	private static final String STR_USUARIO = "usuario";
	private static final String STR_LOGIN_PAGE = "/jsp/login.jsp";
       
    public LoginController() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.getRequestDispatcher(STR_LOGIN_PAGE).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String usuario = request.getParameter(STR_USUARIO);
			String password = request.getParameter("password");
			Usuario usuarioAutenticado = UsuarioDAO.autenticar(usuario, password);
			if(usuarioAutenticado != null) {
				HttpSession session = request.getSession(true);
				switch(usuarioAutenticado.getTipoUsuario()) {
				case "U":
					session.setAttribute(STR_USUARIO,usuarioAutenticado); 
					session.setAttribute("usuarioID",usuarioAutenticado.getIdUsuario());
					response.sendRedirect("UListarTicketController");
					break;
				case "D":
					session.setAttribute(STR_USUARIO,usuarioAutenticado);
					response.sendRedirect("DListarTicketController");
					break;
				default:
					session.invalidate(); 
					request.getRequestDispatcher(STR_LOGIN_PAGE).forward(request, response);
					break;
				
				}
			}
			else {
				request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}