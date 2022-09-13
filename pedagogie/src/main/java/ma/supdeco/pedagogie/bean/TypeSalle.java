package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "typeSalle")
@SQLDelete(sql = "UPDATE typeSalle SET deleted = true WHERE idType=?")
@Where(clause = "deleted=false")
public class TypeSalle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idType;
	private String typeSalle;

	@OneToMany(mappedBy = "typeSalle", cascade = CascadeType.MERGE)
	private List<Salle> salles;

	private boolean deleted = Boolean.FALSE;

	public TypeSalle() {
		super();
	}

	public TypeSalle(Long idType, String typeSalle, List<Salle> salles) {
		super();
		this.idType = idType;
		this.typeSalle = typeSalle;
		this.salles = salles;
	}

	public TypeSalle(Long idType, String typeSalle, List<Salle> salles, boolean deleted) {
		super();
		this.idType = idType;
		this.typeSalle = typeSalle;
		this.salles = salles;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
