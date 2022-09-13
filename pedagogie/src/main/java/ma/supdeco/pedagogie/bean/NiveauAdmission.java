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
@Table(name = "niveauAdmission")
@SQLDelete(sql = "UPDATE niveauAdmission SET deleted = true WHERE idAdmission=?")
@Where(clause = "deleted=false")
public class NiveauAdmission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAdmission;
	private String niveauAdmission;

	@OneToMany(mappedBy = "niveauAdmission", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public NiveauAdmission() {
		super();
	}

	public NiveauAdmission(Long idAdmission, String niveauAdmission, List<Etudiant> etudiants) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiants = etudiants;
	}

	public NiveauAdmission(Long idAdmission, String niveauAdmission, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
