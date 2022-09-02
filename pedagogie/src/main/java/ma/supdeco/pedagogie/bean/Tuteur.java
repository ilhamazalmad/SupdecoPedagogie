package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "tuteur")
public class Tuteur extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTuteur;
	private String nom;
	private String prenom;
	private String civilite;
	private String cin;
	private String telephone;
	private String telephoneProfessionnel;
	private String fixe;
	private String profession;
	private String email;
	private String adresse;

	@ManyToOne
	@JoinColumn(name = "idVille", nullable = false)
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private Etudiant etudiant;

	public Tuteur() {
		super();
	}

	public Tuteur(Long idTuteur, String nom, String prenom, String civilite, String cin, String telephone,
			String telephoneProfessionnel, String fixe, String profession, String email, String adresse, Ville ville) {
		super();
		this.idTuteur = idTuteur;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.cin = cin;
		this.telephone = telephone;
		this.telephoneProfessionnel = telephoneProfessionnel;
		this.fixe = fixe;
		this.profession = profession;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
	}

	public Long getIdTuteur() {
		return idTuteur;
	}

	public void setIdTuteur(Long idTuteur) {
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

	public String getTelephoneProfessionnel() {
		return telephoneProfessionnel;
	}

	public void setTelephoneProfessionnel(String telephoneProfessionnel) {
		this.telephoneProfessionnel = telephoneProfessionnel;
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

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

}
