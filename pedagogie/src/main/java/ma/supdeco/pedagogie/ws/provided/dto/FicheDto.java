package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class FicheDto extends AuditableDto {

	private String codeFiche;
	private String message;
	private String dateFiche;
	private String dateRattrapage;
	private String seanceFaite;
	private SeanceDto seanceDto;
	private List<AbsenceDto> absenceDtos;

	public FicheDto() {
		super();
	}

	public FicheDto(String codeFiche, String message, String dateFiche, String dateRattrapage, String seanceFaite,
			SeanceDto seanceDto, List<AbsenceDto> absenceDtos) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.dateRattrapage = dateRattrapage;
		this.seanceFaite = seanceFaite;
		this.seanceDto = seanceDto;
		this.absenceDtos = absenceDtos;
	}

	public String getCodeFiche() {
		return codeFiche;
	}

	public void setCodeFiche(String codeFiche) {
		this.codeFiche = codeFiche;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateFiche() {
		return dateFiche;
	}

	public void setDateFiche(String dateFiche) {
		this.dateFiche = dateFiche;
	}

	public String getDateRattrapage() {
		return dateRattrapage;
	}

	public void setDateRattrapage(String dateRattrapage) {
		this.dateRattrapage = dateRattrapage;
	}

	public String getSeanceFaite() {
		return seanceFaite;
	}

	public void setSeanceFaite(String seanceFaite) {
		this.seanceFaite = seanceFaite;
	}

	public SeanceDto getSeance() {
		return seanceDto;
	}

	public void setSeance(SeanceDto seanceDto) {
		this.seanceDto = seanceDto;
	}

	public List<AbsenceDto> getAbsenceEtudiants() {
		return absenceDtos;
	}

	public void setAbsenceEtudiants(List<AbsenceDto> absenceDtos) {
		this.absenceDtos = absenceDtos;
	}

}
