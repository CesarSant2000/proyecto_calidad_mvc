package modelo.entidades;
import java.io.Serializable;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	private String tipoUsuario;
	
	public Usuario() {}

	public Usuario(int idUsuario, String tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", tipoUsuario=" + tipoUsuario + "]";
	}
	
	
	
}
