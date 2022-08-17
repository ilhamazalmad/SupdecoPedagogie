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
@Table(name = "serieBac")
public class SerieBac {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSerie;
	private String serieBac;
	private String description;

	@OneToMany(mappedBy = "serieBac", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public SerieBac() {
		super();
	}

	public SerieBac(int idSerie, String serieBac, String description, List<Etudiant> etudiants) {
		super();
		this.idSerie = idSerie;
		this.serieBac = serieBac;
		this.description = description;
		this.etudiants = etudiants;
	}

	public int getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public String getSerieBac() {
		return serieBac;
	}

	public void setSerieBac(String serieBac) {
		this.serieBac = serieBac;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
