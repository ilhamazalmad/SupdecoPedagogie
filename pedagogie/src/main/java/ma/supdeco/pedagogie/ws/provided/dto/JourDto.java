package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class JourDto {

	private String idJour;
	private String jour;
	private List<SeanceDto> seanceDtos;

	public JourDto() {
		super();
	}

	public JourDto(String idJour, String jour, List<SeanceDto> seanceDtos) {
		super();
		this.idJour = idJour;
		this.jour = jour;
		this.seanceDtos = seanceDtos;
	}

	public String getIdJour() {
		return idJour;
	}

	public void setIdJour(String idJour) {
		this.idJour = idJour;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public List<SeanceDto> getSeances() {
		return seanceDtos;
	}

	public void setSeances(List<SeanceDto> seanceDtos) {
		this.seanceDtos = seanceDtos;
	}

}
