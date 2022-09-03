package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Jour {

private Long idJour;
	private String jour;
private List<Seance> seances;

	public Jour() {
		super();
	}

	public Jour(Long idJour, String jour, List<Seance> seances) {
		super();
		this.idJour = idJour;
		this.jour = jour;
		this.seances = seances;
	}

	public Long getIdJour() {
		return idJour;
	}

	public void setIdJour(Long idJour) {
		this.idJour = idJour;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

}
