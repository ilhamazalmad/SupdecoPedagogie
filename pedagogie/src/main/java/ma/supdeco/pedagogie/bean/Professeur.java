package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professeur")
public class Professeur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProfesseur;
	private String nom;
	private String prenom;
	private String civilite;
	private String statut;
	private String telephone;
	private String email;
	private String adresse;

	public java.util.Collection<ProfesseurAnnee> professeurAnnee;

	public Professeur() {
		super();
	}

	public Professeur(int idProfesseur, String nom, String prenom, String civilite, String statut, String telephone,
			String email, String adresse, Collection<ProfesseurAnnee> professeurAnnee) {
		super();
		this.idProfesseur = idProfesseur;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.statut = statut;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.professeurAnnee = professeurAnnee;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<ProfesseurAnnee> getProfesseurAnnee() {
		if (professeurAnnee == null)
			professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
		return professeurAnnee;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorProfesseurAnnee() {
		if (professeurAnnee == null)
			professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
		return professeurAnnee.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newProfesseurAnnee
	 */
	public void setProfesseurAnnee(java.util.Collection<ProfesseurAnnee> newProfesseurAnnee) {
		removeAllProfesseurAnnee();
		for (java.util.Iterator iter = newProfesseurAnnee.iterator(); iter.hasNext();)
			addProfesseurAnnee((ProfesseurAnnee) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newProfesseurAnnee
	 */
	public void addProfesseurAnnee(ProfesseurAnnee newProfesseurAnnee) {
		if (newProfesseurAnnee == null)
			return;
		if (this.professeurAnnee == null)
			this.professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
		if (!this.professeurAnnee.contains(newProfesseurAnnee))
			this.professeurAnnee.add(newProfesseurAnnee);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldProfesseurAnnee
	 */
	public void removeProfesseurAnnee(ProfesseurAnnee oldProfesseurAnnee) {
		if (oldProfesseurAnnee == null)
			return;
		if (this.professeurAnnee != null)
			if (this.professeurAnnee.contains(oldProfesseurAnnee))
				this.professeurAnnee.remove(oldProfesseurAnnee);
	}

	/** @pdGenerated default removeAll */
	public void removeAllProfesseurAnnee() {
		if (professeurAnnee != null)
			professeurAnnee.clear();
	}

	public int getIdProfesseur() {
		return idProfesseur;
	}

	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
