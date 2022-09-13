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
@Table(name = "optionAnnee")
@SQLDelete(sql = "UPDATE optionAnnee SET deleted = true WHERE codeIso3=?")
@Where(clause = "deleted=false")
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeIso3;
	private String pays;

	@OneToMany(mappedBy = "pays", cascade = CascadeType.MERGE)
	private List<Ville> villes;

	@OneToMany(mappedBy = "nationalite", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public Pays() {
		super();
	}

	public Pays(String codeIso3, String pays, List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.codeIso3 = codeIso3;
		this.pays = pays;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public Pays(String codeIso3, String pays, List<Ville> villes, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.codeIso3 = codeIso3;
		this.pays = pays;
		this.villes = villes;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodeIso3() {
		return codeIso3;
	}

	public void setCodeIso3(String codeIso3) {
		this.codeIso3 = codeIso3;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
