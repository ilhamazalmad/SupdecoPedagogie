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
@Table(name = "mois")
@SQLDelete(sql = "UPDATE mois SET deleted = true WHERE idMois=?")
@Where(clause = "deleted=false")
public class Mois {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMois;
	private String mois;

	@OneToMany(mappedBy = "sessionBac", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public Mois() {
		super();
	}

	public Mois(Long idMois, String mois, List<Etudiant> etudiants) {
		super();
		this.idMois = idMois;
		this.mois = mois;
		this.etudiants = etudiants;
	}

	public Mois(Long idMois, String mois, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idMois = idMois;
		this.mois = mois;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdMois() {
		return idMois;
	}

	public void setIdMois(Long idMois) {
		this.idMois = idMois;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
