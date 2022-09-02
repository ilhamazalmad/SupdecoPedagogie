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
@Table(name = "specialiteDiplome")
public class SpecialiteDiplome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSpecialite;
	private String specialiteDiplome;
	private String description;

	@OneToMany(mappedBy = "specialiteDiplome", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public SpecialiteDiplome() {
		super();
	}

	public SpecialiteDiplome(Long idSpecialite, String specialiteDiplome, String description, List<Etudiant> etudiants) {
		super();
		this.idSpecialite = idSpecialite;
		this.specialiteDiplome = specialiteDiplome;
		this.description = description;
		this.etudiants = etudiants;
	}

	public Long getIdSpecialite() {
		return idSpecialite;
	}

	public void setIdSpecialite(Long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}

	public String getSpecialiteDiplome() {
		return specialiteDiplome;
	}

	public void setSpecialiteDiplome(String specialiteDiplome) {
		this.specialiteDiplome = specialiteDiplome;
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
