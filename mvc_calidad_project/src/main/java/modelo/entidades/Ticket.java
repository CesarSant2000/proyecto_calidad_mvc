package modelo.entidades;
import java.io.Serializable;

public class Ticket implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idTicket;
	private String titulo;
	private String estado;
	private String descripcion;
	private String prioridad;
	private int idUser;
	private int idDeveloper;
	private String observaciones;
	
	public Ticket() {}

	public Ticket(int idTicket, String titulo, String estado, String descripcion, String prioridad, int idUser,
			int idDeveloper, String observaciones) {
		super();
		this.idTicket = idTicket;
		this.titulo = titulo;
		this.estado = estado;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.idUser = idUser;
		this.idDeveloper = idDeveloper;
		this.observaciones = observaciones;
	}

	public Ticket(String titulo, String estado, String descripcion, String prioridad, int idUser, int idDeveloper,
			String observaciones) {
		super();
		this.titulo = titulo;
		this.estado = estado;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.idUser = idUser;
		this.idDeveloper = idDeveloper;
		this.observaciones = observaciones;
	}
	
	public Ticket(String titulo, String estado, String descripcion, String prioridad, int idUser, String observaciones) {
		super();
		this.titulo = titulo;
		this.estado = estado;
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.idUser = idUser;
		this.observaciones = observaciones;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdDeveloper() {
		return idDeveloper;
	}

	public void setIdDeveloper(int idDeveloper) {
		this.idDeveloper = idDeveloper;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
