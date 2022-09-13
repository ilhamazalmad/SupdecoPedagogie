package ma.supdeco.pedagogie.ws.provided.dto;

public class SurveillantAnneeDto extends AuditableDto {

	private String idSurveillantAnnee;
	private SurveillantDto surveillantDto;
	private AnneeDto anneeDto;

	public SurveillantAnneeDto() {
		super();
	}

	public SurveillantAnneeDto(String idSurveillantAnnee, SurveillantDto surveillantDto, AnneeDto anneeDto) {
		super();
		this.idSurveillantAnnee = idSurveillantAnnee;
		this.surveillantDto = surveillantDto;
		this.anneeDto = anneeDto;
	}

	public String getIdSurveillantAnnee() {
		return idSurveillantAnnee;
	}

	public void setIdSurveillantAnnee(String idSurveillantAnnee) {
		this.idSurveillantAnnee = idSurveillantAnnee;
	}

	public SurveillantDto getSurveillant() {
		return surveillantDto;
	}

	public void setSurveillant(SurveillantDto surveillantDto) {
		this.surveillantDto = surveillantDto;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

}