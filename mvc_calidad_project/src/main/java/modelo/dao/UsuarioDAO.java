package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.conexion.ConexionBDD;
import modelo.entidades.Usuario;

public class UsuarioDAO {

public UsuarioDAO() {};
	
//R
		private static final String SQL_SELECT_USUARIO_WHERE_PASSWORD="SELECT * FROM USUARIO WHERE username=? AND password=?";
		private static final String SQL_SELECT_USUARIO_WHERE_ID = "SELECT * FROM USUARIO WHERE ID_USUARIO = ?";
		private static final String SQL_SELECT_DEVELOPERS = "SELECT * FROM USUARIO WHERE TIPO_USUARIO = 'D'";
		
		public static Usuario autenticar(String usuario, String password) {
			Usuario u = null;
			
			ResultSet rs = null;
			PreparedStatement pstmt =null;
			try {
				pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT_USUARIO_WHERE_PASSWORD);
				pstmt.setString(1, usuario);
				pstmt.setString(2, password);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					u = new Usuario(rs.getInt("ID_USUARIO"), rs.getString("USERNAME"), rs.getString("TIPO_USUARIO"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return u;
		}
		
		public static Usuario getUsuarioByID(int idUsuario) {
			Usuario u = null;
			
			ResultSet rs = null;
			PreparedStatement pstmt =null;
			try {
				pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT_USUARIO_WHERE_ID);
				pstmt.setInt(1, idUsuario);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					u = new Usuario(rs.getInt("ID_USUARIO"), rs.getString("USERNAME"), rs.getString("TIPO_USUARIO"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return u;
		}
		
		public static ArrayList<Usuario> getAllUsers(){
			ArrayList<Usuario> users = new ArrayList<Usuario>();
			Usuario u = null;
			
			ResultSet rs = null;
			PreparedStatement pstmt =null;
			try {
				pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT_DEVELOPERS);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					u = new Usuario(rs.getInt("ID_USUARIO"), rs.getString("USERNAME"), rs.getString("TIPO_USUARIO"));
					users.add(u);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return users;
		}
	
}
