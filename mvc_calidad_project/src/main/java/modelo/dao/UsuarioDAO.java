package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.conexion.ConexionBDD;
import modelo.entidades.Usuario;

public class UsuarioDAO {

public UsuarioDAO() {};
	
//C
		private static final String SQL_SELECT_USUARIO_WHERE_PASSWORD="SELECT * FROM USUARIO WHERE username=? AND password=?";
		
		
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
	
}
