package ma.supdeco.pedagogie.ws.provided.dto;

public class ExamenDto extends AuditableDto {

	private String idExamen;
	private String noteExamen;
	private String absence;
	private String fraude;
	private EtudiantAnneeDto etudiantAnneeDto;
	private MatiereAnneeDto matiereAnneeDto;
	private SessionDto sessionDto;

	public ExamenDto() {
		super();
	}

	public ExamenDto(String idExamen, String noteExamen, String absence, String fraude, EtudiantAnneeDto etudiantAnneeDto,
			MatiereAnneeDto matiereAnneeDto, SessionDto sessionDto) {
		super();
		this.idExamen = idExamen;
		this.noteExamen = noteExamen;
		this.absence = absence;
		this.fraude = fraude;
		this.etudiantAnneeDto = etudiantAnneeDto;
		this.matiereAnneeDto = matiereAnneeDto;
		this.sessionDto = sessionDto;
	}

	public String getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(String idExamen) {
		this.idExamen = idExamen;
	}

	public String getNoteExamen() {
		return noteExamen;
	}

	public void setNoteExamen(String noteExamen) {
		this.noteExamen = noteExamen;
	}

	public String isAbsence() {
		return absence;
	}

	public void setAbsence(String absence) {
		this.absence = absence;
	}

	public String isFraude() {
		return fraude;
	}

	public void setFraude(String fraude) {
		this.fraude = fraude;
	}

	public EtudiantAnneeDto getEtudiantAnnee() {
		return etudiantAnneeDto;
	}

	public void setEtudiantAnnee(EtudiantAnneeDto etudiantAnneeDto) {
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public MatiereAnneeDto getMatiereAnnee() {
		return matiereAnneeDto;
	}

	public void setMatiereAnnee(MatiereAnneeDto matiereAnneeDto) {
		this.matiereAnneeDto = matiereAnneeDto;
	}

	public SessionDto getSession() {
		return sessionDto;
	}

	public void setSession(SessionDto sessionDto) {
		this.sessionDto = sessionDto;
	}

}
