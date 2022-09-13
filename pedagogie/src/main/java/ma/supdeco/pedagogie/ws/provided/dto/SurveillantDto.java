package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SurveillantDto extends AuditableDto {

	private String idSurveillant;
	private String nom;
	private String prenom;
	private String cin;
	private String civilite;
	private String telephone;
	private String email;
	private String adresse;
	private VilleDto villeDto;
	private List<SurveillantAnneeDto> surveillantAnneeDtos;

	public SurveillantDto() {
		super();
	}

	public SurveillantDto(String idSurveillant, String nom, String prenom, String cin, String civilite, String telephone,
			String email, String adresse, VilleDto villeDto, List<SurveillantAnneeDto> surveillantAnneeDtos) {
		super();
		this.idSurveillant = idSurveillant;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.civilite = civilite;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.villeDto = villeDto;
		this.surveillantAnneeDtos = surveillantAnneeDtos;
	}

	public String getIdSurveillant() {
		return idSurveillant;
	}

	public void setIdSurveillant(String idSurveillant) {
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

	public VilleDto getVille() {
		return villeDto;
	}

	public void setVille(VilleDto villeDto) {
		this.villeDto = villeDto;
	}

	public List<SurveillantAnneeDto> getSurveillantAnnees() {
		return surveillantAnneeDtos;
	}

	public void setSurveillantAnnees(List<SurveillantAnneeDto> surveillantAnneeDtos) {
		this.surveillantAnneeDtos = surveillantAnneeDtos;
	}

}
