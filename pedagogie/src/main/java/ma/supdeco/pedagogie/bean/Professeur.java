package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "professeur")
public class Professeur extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfesseur;
	private String nom;
	private String prenom;
	private String civilite;
	private String statut;
	private String telephone;
	private String email;
	private String adresse;
	private String cin;
	private String cv;
	private String diplome;
	private String engagement;
	private String contrat;

	@ManyToOne
	@JoinColumn(name = "idVille", nullable = false)
	private Ville ville;

	@ManyToOne
	@JoinColumn(name = "idtitreDiplome", nullable = false)
	private Diplome titreDiplome;

	@OneToMany(mappedBy = "professeur", cascade = CascadeType.MERGE)
	private List<ProfesseurAnnee> professeurAnnees;

	public Professeur() {
		super();
	}

	public Professeur(Long idProfesseur, String nom, String prenom, String civilite, String statut, String telephone,
			String email, String adresse, Ville ville, String cin, String cv, String diplome, String engagement,
			String contrat, Diplome titreDiplome, List<ProfesseurAnnee> professeurAnnees) {
		super();
		this.idProfesseur = idProfesseur;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.statut = statut;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.cin = cin;
		this.cv = cv;
		this.diplome = diplome;
		this.engagement = engagement;
		this.contrat = contrat;
		this.titreDiplome = titreDiplome;
		this.professeurAnnees = professeurAnnees;
	}

	public Long getIdProfesseur() {
		return idProfesseur;
	}

	public void setIdProfesseur(Long idProfesseur) {
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

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getEngagement() {
		return engagement;
	}

	public void setEngagement(String engagement) {
		this.engagement = engagement;
	}

	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public Diplome getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(Diplome titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<ProfesseurAnnee> getProfesseurAnnees() {
		return professeurAnnees;
	}

	public void setProfesseurAnnees(List<ProfesseurAnnee> professeurAnnees) {
		this.professeurAnnees = professeurAnnees;
	}

}
