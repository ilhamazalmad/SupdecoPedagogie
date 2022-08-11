package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "responsableInscription")

public class ResponsableInscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idResponsable;
	private String nom;

	public Etudiant[] etudiant;

	public ResponsableInscription() {
		super();
	}

	public ResponsableInscription(int idResponsable, String nom, Etudiant[] etudiant) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiant = etudiant;
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

	public Etudiant[] getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant[] etudiant) {
		this.etudiant = etudiant;
	}
}
