package ma.supdeco.pedagogie.ws.provided.dto;

public class NumerotationDto extends AuditableDto {

	private String idNumerotation;
	private String numerotation;
	private MatiereAnneeDto matiereAnneeDto;
	private EtudiantAnneeDto etudiantAnneeDto;
	private SalleDto salleDto;
	private SessionDto sessionDto;

	public NumerotationDto() {
		super();
	}

	public NumerotationDto(String idNumerotation, String numerotation, MatiereAnneeDto matiereAnneeDto,
			EtudiantAnneeDto etudiantAnneeDto, SalleDto salleDto, SessionDto sessionDto) {
		super();
		this.idNumerotation = idNumerotation;
		this.numerotation = numerotation;
		this.matiereAnneeDto = matiereAnneeDto;
		this.etudiantAnneeDto = etudiantAnneeDto;
		this.salleDto = salleDto;
		this.sessionDto = sessionDto;
	}

	public String getIdNumerotation() {
		return idNumerotation;
	}

	public void setIdNumerotation(String idNumerotation) {
		this.idNumerotation = idNumerotation;
	}

	public String getNumerotation() {
		return numerotation;
	}

	public void setNumerotation(String numerotation) {
		this.numerotation = numerotation;
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

	public SalleDto getSalle() {
		return salleDto;
	}

	public void setSalle(SalleDto salleDto) {
		this.salleDto = salleDto;
	}

	public SessionDto getSession() {
		return sessionDto;
	}

	public void setSession(SessionDto sessionDto) {
		this.sessionDto = sessionDto;
	}

}
