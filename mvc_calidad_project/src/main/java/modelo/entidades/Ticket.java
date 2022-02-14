package modelo.entidades;
import java.io.Serializable;

public class Ticket implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int idTicket;
	private String tipoTicket;
	private String descripcionTicket;
	
	public Ticket() {}

	public Ticket(int idTicket, String tipoTicket, String descripcionTicket) {
		super();
		this.idTicket = idTicket;
		this.tipoTicket = tipoTicket;
		this.descripcionTicket = descripcionTicket;
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public String getTipoTicket() {
		return tipoTicket;
	}

	public void setTipoTicket(String tipoTicket) {
		this.tipoTicket = tipoTicket;
	}

	public String getDescripcionTicket() {
		return descripcionTicket;
	}

	public void setDescripcionTicket(String descripcionTicket) {
		this.descripcionTicket = descripcionTicket;
	}

	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", tipoTicket=" + tipoTicket + ", descripcionTicket="
				+ descripcionTicket + "]";
	}
	
	

}
