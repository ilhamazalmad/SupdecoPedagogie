package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SessionDto {

	private String idSession;
	private String session;
	private boolean active;
	private List<ExamenDto> examenDtos;
	private List<RachetageDto> rachetageDtos;
	private List<NumerotationDto> numerotationDtos;

	public SessionDto() {
		super();
	}

	public SessionDto(String idSession, String session, boolean active, List<ExamenDto> examenDtos, List<RachetageDto> rachetageDtos,
			List<NumerotationDto> numerotationDtos) {
		super();
		this.idSession = idSession;
		this.session = session;
		this.active = active;
		this.examenDtos = examenDtos;
		this.rachetageDtos = rachetageDtos;
		this.numerotationDtos = numerotationDtos;
	}

	public String getIdSession() {
		return idSession;
	}

	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<ExamenDto> getExamens() {
		return examenDtos;
	}

	public void setExamens(List<ExamenDto> examenDtos) {
		this.examenDtos = examenDtos;
	}

	public List<RachetageDto> getRachetages() {
		return rachetageDtos;
	}

	public void setRachetages(List<RachetageDto> rachetageDtos) {
		this.rachetageDtos = rachetageDtos;
	}

	public List<NumerotationDto> getNumerotations() {
		return numerotationDtos;
	}

	public void setNumerotations(List<NumerotationDto> numerotationDtos) {
		this.numerotationDtos = numerotationDtos;
	}

}
