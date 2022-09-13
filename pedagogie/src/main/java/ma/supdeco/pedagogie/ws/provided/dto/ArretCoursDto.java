package ma.supdeco.pedagogie.ws.provided.dto;

public class ArretCoursDto extends AuditableDto {

	private String idArret;
	private String dateDebut;
	private String dateFin;
	private String active;
	private MotifArretDto motifArretDto;
	private EtudiantAnneeDto etudiantAnneeDto;
	private UtilisateurDto utilisateurDto;

	public ArretCoursDto() {
		super();
	}

	public ArretCoursDto(String idArret, String dateDebut, String dateFin, String active, MotifArretDto motifArretDto,
			EtudiantAnneeDto etudiantAnneeDto, UtilisateurDto utilisateurDto) {
		super();
		this.idArret = idArret;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.active = active;
		this.motifArretDto = motifArretDto;
		this.etudiantAnneeDto = etudiantAnneeDto;
		this.utilisateurDto = utilisateurDto;
	}

	public String getIdArret() {
		return idArret;
	}

	public void setIdArret(String idArret) {
		this.idArret = idArret;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String isActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public MotifArretDto getMotifArret() {
		return motifArretDto;
	}

	public void setMotifArret(MotifArretDto motifArretDto) {
		this.motifArretDto = motifArretDto;
	}

	public EtudiantAnneeDto getEtudiantAnnee() {
		return etudiantAnneeDto;
	}

	public void setEtudiantAnnee(EtudiantAnneeDto etudiantAnneeDto) {
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public UtilisateurDto getUtilisateur() {
		return utilisateurDto;
	}

	public void setUtilisateur(UtilisateurDto utilisateurDto) {
		this.utilisateurDto = utilisateurDto;
	}

}
