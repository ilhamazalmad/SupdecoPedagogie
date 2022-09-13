package ma.supdeco.pedagogie.ws.provided.dto;

public class RachetageDto extends AuditableDto {

	private String idRachetage;
	private String rachetage;
	private SessionDto sessionDto;
	private MatiereAnneeDto matiereAnneeDto;

	private EtudiantAnneeDto etudiantAnneeDto;

	public RachetageDto() {
		super();
	}

	public RachetageDto(String idRachetage, String rachetage, SessionDto sessionDto, MatiereAnneeDto matiereAnneeDto,
			EtudiantAnneeDto etudiantAnneeDto) {
		super();
		this.idRachetage = idRachetage;
		this.rachetage = rachetage;
		this.sessionDto = sessionDto;
		this.matiereAnneeDto = matiereAnneeDto;
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public String getIdRachetage() {
		return idRachetage;
	}

	public void setIdRachetage(String idRachetage) {
		this.idRachetage = idRachetage;
	}

	public String isRachetage() {
		return rachetage;
	}

	public void setRachetage(String rachetage) {
		this.rachetage = rachetage;
	}

	public SessionDto getSession() {
		return sessionDto;
	}

	public void setSession(SessionDto sessionDto) {
		this.sessionDto = sessionDto;
	}

	public MatiereAnneeDto getMatiereAnnee() {
		return matiereAnneeDto;
	}

	public void setMatiereAnnee(MatiereAnneeDto matiereAnneeDto) {
		this.matiereAnneeDto = matiereAnneeDto;
	}

	public EtudiantAnneeDto getEtudiantAnnee() {
		return etudiantAnneeDto;
	}

	public void setEtudiantAnnee(EtudiantAnneeDto etudiantAnneeDto) {
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

}
