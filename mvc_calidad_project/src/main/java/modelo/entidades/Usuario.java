package modelo.entidades;
import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String username;
	private String password;
	private String tipoUsuario;
	
	public Usuario() {}
	
	public Usuario(int idUsuario, String username, String tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.username = username;
		this.tipoUsuario = tipoUsuario;
	}
	
	public Usuario(String username, String tipoUsuario) {
		super();
		this.username = username;
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
