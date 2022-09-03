package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Surveillant extends Auditable{

private Long idSurveillant;
	private String nom;
	private String prenom;
	private String cin;
	private String civilite;
	private String telephone;
	private String email;
	private String adresse;
private Ville ville;
private List<SurveillantAnnee> surveillantAnnees;

	public Surveillant() {
		super();
	}

	public Surveillant(Long idSurveillant, String nom, String prenom, String cin, String civilite, String telephone,
			String email, String adresse, Ville ville, List<SurveillantAnnee> surveillantAnnees) {
		super();
		this.idSurveillant = idSurveillant;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.civilite = civilite;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.ville = ville;
		this.surveillantAnnees = surveillantAnnees;
	}

	public Long getIdSurveillant() {
		return idSurveillant;
	}

	public void setIdSurveillant(Long idSurveillant) {
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

	public List<SurveillantAnnee> getSurveillantAnnees() {
		return surveillantAnnees;
	}

	public void setSurveillantAnnees(List<SurveillantAnnee> surveillantAnnees) {
		this.surveillantAnnees = surveillantAnnees;
	}

}
