package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBDD {
	private static ConexionBDD conexionClass = null;
	private static Connection instancia = null;
	
	private ConexionBDD() {
		try {
		if(instancia == null) {
			String servidor = "20.201.64.194";
			String database = "calidad_mvc";
			String usuario = "project";
			String password = "";
			String url = "jdbc:mysql://" + servidor + "/" + database;
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			instancia = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion realizada");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConexion() {
		if(conexionClass == null) {
			conexionClass = new ConexionBDD();
		}
		return instancia;
	}
	
	public static void cerrar (ResultSet rs) {
		try {
			rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void cerrar (PreparedStatement pstmt) {
		try {
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
