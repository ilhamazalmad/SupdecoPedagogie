package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class HeureSeance {

private Long idHeure;
	private String heure;
private List<Seance> seancesDebuts;
private List<Seance> seancesFins;

	public HeureSeance() {
		super();
	}

	public HeureSeance(Long idHeure, String heure, List<Seance> seancesDebuts, List<Seance> seancesFins) {
		super();
		this.idHeure = idHeure;
		this.heure = heure;
		this.seancesDebuts = seancesDebuts;
		this.seancesFins = seancesFins;
	}

	public Long getIdHeure() {
		return idHeure;
	}

	public void setIdHeure(Long idHeure) {
		this.idHeure = idHeure;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public List<Seance> getSeancesDebuts() {
		return seancesDebuts;
	}

	public void setSeancesDebuts(List<Seance> seancesDebuts) {
		this.seancesDebuts = seancesDebuts;
	}

	public List<Seance> getSeancesFins() {
		return seancesFins;
	}

	public void setSeancesFins(List<Seance> seancesFins) {
		this.seancesFins = seancesFins;
	}

}
