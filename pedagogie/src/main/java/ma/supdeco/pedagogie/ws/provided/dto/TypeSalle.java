package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class TypeSalle {

private Long idType;
	private String typeSalle;
private List<Salle> salles;

	public TypeSalle() {
		super();
	}

	public TypeSalle(Long idType, String typeSalle, List<Salle> salles) {
		super();
		this.idType = idType;
		this.typeSalle = typeSalle;
		this.salles = salles;
	}

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public List<Salle> getSalles() {
		return salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

}
