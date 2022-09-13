package ma.supdeco.pedagogie.ws.provided.dto;

public class AbsenceDto {

	private String idAbsence;
	private String absent;
	private String justifiee;
	private String cause1;
	private String cause2;
	private EtudiantAnneeDto etudiantAnneeDto;
	private FicheDto ficheDto;

	public AbsenceDto() {
		super();
	}

	public AbsenceDto(String idAbsence, String absent, String justifiee, String cause1, String cause2,
			EtudiantAnneeDto etudiantAnneeDto, FicheDto ficheDto) {
		super();
		this.idAbsence = idAbsence;
		this.absent = absent;
		this.justifiee = justifiee;
		this.cause1 = cause1;
		this.cause2 = cause2;
		this.etudiantAnneeDto = etudiantAnneeDto;
		this.ficheDto = ficheDto;
	}

	public String getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(String idAbsence) {
		this.idAbsence = idAbsence;
	}

	public String isAbsent() {
		return absent;
	}

	public void setAbsent(String absent) {
		this.absent = absent;
	}

	public String isJustifiee() {
		return justifiee;
	}

	public void setJustifiee(String justifiee) {
		this.justifiee = justifiee;
	}

	public String getCause1() {
		return cause1;
	}

	public void setCause1(String cause1) {
		this.cause1 = cause1;
	}

	public String getCause2() {
		return cause2;
	}

	public void setCause2(String cause2) {
		this.cause2 = cause2;
	}

	public EtudiantAnneeDto getEtudiantAnnee() {
		return etudiantAnneeDto;
	}

	public void setEtudiantAnnee(EtudiantAnneeDto etudiantAnneeDto) {
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public FicheDto getFiche() {
		return ficheDto;
	}

	public void setFiche(FicheDto ficheDto) {
		this.ficheDto = ficheDto;
	}

}
