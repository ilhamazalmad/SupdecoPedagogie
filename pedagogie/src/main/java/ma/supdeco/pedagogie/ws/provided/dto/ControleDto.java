package ma.supdeco.pedagogie.ws.provided.dto;

public class ControleDto extends AuditableDto {

	private String idControle;
	private String note16;
	private String note4;
	private String absence;
	private String fraude;
	private MatiereAnneeDto matiereAnneeDto;
	private EtudiantAnneeDto etudiantAnneeDto;

	public ControleDto() {
		super();
	}

	public ControleDto(String idControle, String note16, String note4, String absence, String fraude,
			MatiereAnneeDto matiereAnneeDto, EtudiantAnneeDto etudiantAnneeDto) {
		super();
		this.idControle = idControle;
		this.note16 = note16;
		this.note4 = note4;
		this.absence = absence;
		this.fraude = fraude;
		this.matiereAnneeDto = matiereAnneeDto;
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public String getIdControle() {
		return idControle;
	}

	public void setIdControle(String idControle) {
		this.idControle = idControle;
	}

	public String getNote16() {
		return note16;
	}

	public void setNote16(String note16) {
		this.note16 = note16;
	}

	public String getNote4() {
		return note4;
	}

	public void setNote4(String note4) {
		this.note4 = note4;
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
