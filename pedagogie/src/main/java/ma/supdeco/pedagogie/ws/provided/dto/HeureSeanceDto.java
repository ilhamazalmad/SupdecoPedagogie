package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class HeureSeanceDto {

	private String idHeure;
	private String heure;
	private List<SeanceDto> seancesDebuts;
	private List<SeanceDto> seancesFins;

	public HeureSeanceDto() {
		super();
	}

	public HeureSeanceDto(String idHeure, String heure, List<SeanceDto> seancesDebuts, List<SeanceDto> seancesFins) {
		super();
		this.idHeure = idHeure;
		this.heure = heure;
		this.seancesDebuts = seancesDebuts;
		this.seancesFins = seancesFins;
	}

	public String getIdHeure() {
		return idHeure;
	}

	public void setIdHeure(String idHeure) {
		this.idHeure = idHeure;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public List<SeanceDto> getSeancesDebuts() {
		return seancesDebuts;
	}

	public void setSeancesDebuts(List<SeanceDto> seancesDebuts) {
		this.seancesDebuts = seancesDebuts;
	}

	public List<SeanceDto> getSeancesFins() {
		return seancesFins;
	}

	public void setSeancesFins(List<SeanceDto> seancesFins) {
		this.seancesFins = seancesFins;
	}

}
