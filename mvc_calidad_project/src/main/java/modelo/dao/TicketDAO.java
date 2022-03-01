package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.conexion.ConexionBDD;
import modelo.entidades.Ticket;

public class TicketDAO {
	// R
	public static final String SQL_GET_ALL_TICKETS = "SELECT * FROM TICKET";
	public static final String SQL_GET_USER_TICKETS = "SELECT * FROM TICKET WHERE USER_ID = ?";
	public static final String SQL_GET_UNIQUE_TICKET = "SELECT * FROM TICKET WHERE ID_TICKET = ?";
	public static final String SQL_GET_FIRST_DEVELOPER = "SELECT * FROM USUARIO WHERE TIPO_USUARIO = 'D' LIMIT 1";
	// U
	public static final String SQL_UPDATE_TICKET_DEVELOPER = "UPDATE TICKET SET ESTADO_TICKET = ?, PRIORIDAD_TICKET = ?, DEVELOPER_ID = ?, OBSERVACIONES = ? WHERE ID_TICKET = ?";
	public static final String SQL_UPDATE_TICKET_USER = "UPDATE TICKET SET DESCRIPCION_TICKET = ? WHERE ID_TICKET = ?";
	// C
	public static final String SQL_CREATE_TICKET = "INSERT INTO TICKET (TITULO_TICKET, ESTADO_TICKET, DESCRIPCION_TICKET, PRIORIDAD_TICKET, USER_ID, DEVELOPER_ID, OBSERVACIONES) VALUES (?, ?, ?, ?, ?, ?, ?)";
	
	
	public TicketDAO() {};
	
	public static boolean crearTicket(Ticket t) {
		try {
			ResultSet rs1 = null;
			PreparedStatement pstmt1 =null;
			pstmt1 = ConexionBDD.getConexion().prepareStatement(SQL_GET_FIRST_DEVELOPER);
			rs1 = pstmt1.executeQuery();
			
			
			PreparedStatement pstmt2 =null;
			pstmt2 = ConexionBDD.getConexion().prepareStatement(SQL_CREATE_TICKET);
			pstmt2.setString(1, t.getTitulo());	
			pstmt2.setString(2, t.getEstado());
			pstmt2.setString(3, t.getDescripcion());
			pstmt2.setString(4, t.getPrioridad());
			pstmt2.setInt(5, t.getIdUser());
			while(rs1.next()) {
				pstmt2.setInt(6, rs1.getInt("ID_USUARIO"));
			}
			pstmt2.setString(7, t.getObservaciones());
			pstmt2.execute();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
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
	
	public static boolean actualizarTicketUsuario(Ticket t) {
		try {
			PreparedStatement pstmt =null;
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_UPDATE_TICKET_USER);
			pstmt.setString(1, t.getDescripcion());
			pstmt.setInt(2, t.getIdTicket());
			
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
		Ticket ticket = null;
		ArrayList<Ticket> allTickets = new ArrayList<>();
		try {
			ResultSet rs = null;
			PreparedStatement prstm = null;
			prstm = ConexionBDD.getConexion().prepareStatement(SQL_GET_USER_TICKETS);
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
