package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "typeSalle")
public class TypeSalle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idType;
	private String typeSalle;

	@OneToMany(mappedBy = "typeSalle", cascade = CascadeType.MERGE)
	private List<Salle> salles;

	public TypeSalle() {
		super();
	}

	public TypeSalle(int idType, String typeSalle, List<Salle> salles) {
		super();
		this.idType = idType;
		this.typeSalle = typeSalle;
		this.salles = salles;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
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
