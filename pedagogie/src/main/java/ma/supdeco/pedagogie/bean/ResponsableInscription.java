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
@Table(name = "responsableInscription")
public class ResponsableInscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idResponsable;
	private String nom;

	@OneToMany(mappedBy = "responsableInscription", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public ResponsableInscription() {
		super();
	}

	public ResponsableInscription(Long idResponsable, String nom, List<Etudiant> etudiants) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiants = etudiants;
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
