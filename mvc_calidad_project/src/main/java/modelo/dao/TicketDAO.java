package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.ConexionBDD;
import modelo.entidades.Ticket;

public class TicketDAO {
	// R
	public static final String SQL_GET_ALL_TICKETS = "SELECT * FROM TICKET";
	public static final String SQL_GET_USER_TICKETS = "SELECT * FROM TICKET WHERE USER_ID = ?";
	public static final String SQL_GET_UNIQUE_TICKET = "SELECT * FROM TICKET WHERE ID_TICKET = ?";
	// U
	public static final String SQL_UPDATE_TICKET_DEVELOPER = "UPDATE TICKET SET ESTADO_TICKET = ?, PRIORIDAD_TICKET = ?, DEVELOPER_ID = ?, OBSERVACIONES = ? WHERE ID_TICKET = ?";
	
	public TicketDAO() {};
	
	public static boolean crearTicket(Ticket t) {
		return true;
	}
	
	public static boolean actualizarTicketDesarrollador(Ticket t) {
		try {
			PreparedStatement pstmt =null;
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_UPDATE_TICKET_DEVELOPER);
			pstmt.setString(1, t.getEstado());	
			pstmt.setString(2, t.getPrioridad());
			pstmt.setInt(3, t.getIdDeveloper());
			pstmt.setString(4, t.getObservaciones());
			pstmt.setInt(5, t.getIdTicket());
			
			int fila = pstmt.executeUpdate();
			System.out.println("Numero de filas afectadas: "+fila);
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static Ticket getTicket(int idTicket) {
		Ticket ticket = null;
		try {
			ResultSet rs = null;
			PreparedStatement prstm = null;
			prstm = ConexionBDD.getConexion().prepareStatement(SQL_GET_UNIQUE_TICKET);
			prstm.setInt(1, idTicket);
			rs = prstm.executeQuery();
			while(rs.next()) {
				ticket = new Ticket(rs.getInt("ID_TICKET"), rs.getString("TITULO_TICKET"), rs.getString("ESTADO_TICKET"), 
						rs.getString("DESCRIPCION_TICKET"), rs.getString("PRIORIDAD_TICKET"), rs.getInt("USER_ID"), rs.getInt("DEVELOPER_ID"),
						rs.getString("OBSERVACIONES"));
				return ticket;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ticket;
	}
	
	public static ArrayList<Ticket> getTickets(){
		Ticket ticket = null;
		ArrayList<Ticket> allTickets = new ArrayList<>();
		try {
			ResultSet rs = null;
			PreparedStatement prstm = null;
			prstm = ConexionBDD.getConexion().prepareStatement(SQL_GET_ALL_TICKETS);
			rs = prstm.executeQuery();
			while(rs.next()) {
				ticket = new Ticket(rs.getInt("ID_TICKET"), rs.getString("TITULO_TICKET"), rs.getString("ESTADO_TICKET"), 
						rs.getString("DESCRIPCION_TICKET"), rs.getString("PRIORIDAD_TICKET"), rs.getInt("USER_ID"), rs.getInt("DEVELOPER_ID"),
						rs.getString("OBSERVACIONES"));
				allTickets.add(ticket);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTickets;
	}
	
	public static ArrayList<Ticket> getTickets(int idUsuario){
//		Lo dejo implementando pero no lo pruebo 
//		TODO: Cesar probar el metodo
		Ticket ticket = null;
		ArrayList<Ticket> allTickets = new ArrayList<>();
		try {
			ResultSet rs = null;
			PreparedStatement prstm = null;
			prstm = ConexionBDD.getConexion().prepareStatement(SQL_GET_ALL_TICKETS);
			prstm.setInt(1, idUsuario);
			rs = prstm.executeQuery();
			while(rs.next()) {
				ticket = new Ticket(rs.getInt("ID_TICKET"), rs.getString("TITULO_TICKET"), rs.getString("ESTADO_TICKET"), 
						rs.getString("DESCRIPCION_TICKET"), rs.getString("PRIORIDAD_TICKET"), rs.getInt("USER_ID"), rs.getInt("DEVELOPER_ID"),
						rs.getString("OBSERVACIONES"));
				allTickets.add(ticket);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTickets;
	}
}
