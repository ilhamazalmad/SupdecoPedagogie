package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class ProfesseurDto extends AuditableDto {

	private String idProfesseur;
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
	private VilleDto villeDto;
	private DiplomeDto titreDiplome;
	private List<ProfesseurAnneeDto> professeurAnneeDtos;

	public ProfesseurDto() {
		super();
	}

	public ProfesseurDto(String idProfesseur, String nom, String prenom, String civilite, String statut, String telephone,
			String email, String adresse, VilleDto villeDto, String cin, String cv, String diplome, String engagement,
			String contrat, DiplomeDto titreDiplome, List<ProfesseurAnneeDto> professeurAnneeDtos) {
		super();
		this.idProfesseur = idProfesseur;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
		this.statut = statut;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.villeDto = villeDto;
		this.cin = cin;
		this.cv = cv;
		this.diplome = diplome;
		this.engagement = engagement;
		this.contrat = contrat;
		this.titreDiplome = titreDiplome;
		this.professeurAnneeDtos = professeurAnneeDtos;
	}

	public String getIdProfesseur() {
		return idProfesseur;
	}

	public void setIdProfesseur(String idProfesseur) {
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

	public VilleDto getVille() {
		return villeDto;
	}

	public void setVille(VilleDto villeDto) {
		this.villeDto = villeDto;
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

	public DiplomeDto getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(DiplomeDto titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<ProfesseurAnneeDto> getProfesseurAnnees() {
		return professeurAnneeDtos;
	}

	public void setProfesseurAnnees(List<ProfesseurAnneeDto> professeurAnneeDtos) {
		this.professeurAnneeDtos = professeurAnneeDtos;
	}

}
