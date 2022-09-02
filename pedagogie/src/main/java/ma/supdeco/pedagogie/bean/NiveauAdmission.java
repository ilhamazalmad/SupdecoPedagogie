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
@Table(name = "niveauAdmission")
public class NiveauAdmission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdmission;
	private String niveauAdmission;

	@OneToMany(mappedBy = "niveauAdmission", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public NiveauAdmission() {
		super();
	}

	public NiveauAdmission(Long idAdmission, String niveauAdmission, List<Etudiant> etudiants) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiants = etudiants;
	}

	public Long getIdAdmission() {
		return idAdmission;
	}

	public void setIdAdmission(Long idAdmission) {
		this.idAdmission = idAdmission;
	}

	public String getNiveauAdmission() {
		return niveauAdmission;
	}

	public void setNiveauAdmission(String niveauAdmission) {
		this.niveauAdmission = niveauAdmission;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
