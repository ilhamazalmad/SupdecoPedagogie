package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "lycee")
@SQLDelete(sql = "UPDATE lycee SET deleted = true WHERE idLycee=?")
@Where(clause = "deleted=false")
public class Lycee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idLycee;
	private String nomLycee;
	private String typeLycee;

	@ManyToMany
	@JoinTable(name = "lycee_ville", joinColumns = @JoinColumn(name = "idLycee"), inverseJoinColumns = @JoinColumn(name = "idVille"))
	private List<Ville> villes;

	@OneToMany(mappedBy = "lyceeBac", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public Lycee() {
		super();
	}

	public Lycee(Long idLycee, String nomLycee, String typeLycee, List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.idLycee = idLycee;
		this.nomLycee = nomLycee;
		this.typeLycee = typeLycee;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public Lycee(Long idLycee, String nomLycee, String typeLycee, List<Ville> villes, List<Etudiant> etudiants,
			boolean deleted) {
		super();
		this.idLycee = idLycee;
		this.nomLycee = nomLycee;
		this.typeLycee = typeLycee;
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

	public Long getIdLycee() {
		return idLycee;
	}

	public void setIdLycee(Long idLycee) {
		this.idLycee = idLycee;
	}

	public String getNomLycee() {
		return nomLycee;
	}

	public void setNomLycee(String nomLycee) {
		this.nomLycee = nomLycee;
	}

	public String getTypeLycee() {
		return typeLycee;
	}

	public void setTypeLycee(String typeLycee) {
		this.typeLycee = typeLycee;
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
