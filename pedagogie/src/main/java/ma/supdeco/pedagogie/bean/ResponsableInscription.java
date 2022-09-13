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
@Table(name = "responsableInscription")
@SQLDelete(sql = "UPDATE responsableInscription SET deleted = true WHERE idResponsable=?")
@Where(clause = "deleted=false")
public class ResponsableInscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idResponsable;
	private String nom;

	@OneToMany(mappedBy = "responsableInscription", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public ResponsableInscription() {
		super();
	}

	public ResponsableInscription(Long idResponsable, String nom, List<Etudiant> etudiants) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiants = etudiants;
	}

	public ResponsableInscription(Long idResponsable, String nom, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
