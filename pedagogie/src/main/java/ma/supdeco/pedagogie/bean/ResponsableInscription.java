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
	private int idResponsable;
	private String nom;

	@OneToMany(mappedBy = "responsableInscription", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	public ResponsableInscription() {
		super();
	}

	public ResponsableInscription(int idResponsable, String nom, List<EtudiantAnnee> etudiantAnnees) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiantAnnees = etudiantAnnees;
	}

	public int getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

}
