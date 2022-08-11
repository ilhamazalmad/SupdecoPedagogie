package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tuteur")

public class Tuteur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTuteur;
	private String nom;
	private String prenom;
	private String civilite;
	private String cin;
	private String telephone;
	private String fixe;
	private String profession;
	private String email;
	private String adresse;

	public Tuteur() {
		super();
	}

	public Tuteur(int idTuteur, String nom, String prenom, String civilite, String cin, String telephone, String fixe,
			String profession, String email, String adresse) {
		super();
		this.idTuteur = idTuteur;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.cin = cin;
		this.telephone = telephone;
		this.fixe = fixe;
		this.profession = profession;
		this.email = email;
		this.adresse = adresse;
	}

	public int getIdTuteur() {
		return idTuteur;
	}

	public void setIdTuteur(int idTuteur) {
		this.idTuteur = idTuteur;
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

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFixe() {
		return fixe;
	}

	public void setFixe(String fixe) {
		this.fixe = fixe;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
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
