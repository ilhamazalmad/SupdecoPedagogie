package ma.supdeco.pedagogie.ws.provided.dto;

public class TuteurDto extends AuditableDto {

	private String idTuteur;
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
	private VilleDto villeDto;
	private EtudiantDto etudiantDto;

	public TuteurDto() {
		super();
	}

	public TuteurDto(String idTuteur, String nom, String prenom, String civilite, String cin, String telephone,
			String telephoneProfessionnel, String fixe, String profession, String email, String adresse,
			VilleDto villeDto) {
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
		this.villeDto = villeDto;
	}

	public String getIdTuteur() {
		return idTuteur;
	}

	public void setIdTuteur(String idTuteur) {
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

	public VilleDto getVille() {
		return villeDto;
	}

	public void setVille(VilleDto villeDto) {
		this.villeDto = villeDto;
	}

	public VilleDto getVilleDto() {
		return villeDto;
	}

	public void setVilleDto(VilleDto villeDto) {
		this.villeDto = villeDto;
	}

	public EtudiantDto getEtudiantDto() {
		return etudiantDto;
	}

	public void setEtudiantDto(EtudiantDto etudiantDto) {
		this.etudiantDto = etudiantDto;
	}

}
