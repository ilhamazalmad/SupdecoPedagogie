package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surveillant")
public class Surveillant implements Serializable{
	  public Surveillant() {
		super();
	}
	public Surveillant(int idSurveillant, String nom, String prenom, String cin, String civilite, String telephone,
			String email) {
		super();
		this.idSurveillant = idSurveillant;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.civilite = civilite;
		this.telephone = telephone;
		this.email = email;
	}
	private int idSurveillant;
	   private String nom;
	   private String prenom;
	   private String cin;
	   private String civilite;
	   private String telephone;
	   private String email;
	public int getIdSurveillant() {
		return idSurveillant;
	}
	public void setIdSurveillant(int idSurveillant) {
		this.idSurveillant = idSurveillant;
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
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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
}
