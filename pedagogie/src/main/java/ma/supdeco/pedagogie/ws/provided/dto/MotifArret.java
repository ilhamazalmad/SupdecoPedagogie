package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class MotifArret {

private Long idMotif;
	private int motifArret;
private List<ArretCours> arretsCours;

	public MotifArret() {
		super();
	}

	public MotifArret(Long idMotif, int motifArret, List<ArretCours> arretsCours) {
		super();
		this.idMotif = idMotif;
		this.motifArret = motifArret;
		this.arretsCours = arretsCours;
	}

	public Long getIdMotif() {
		return idMotif;
	}

	public void setIdMotif(Long idMotif) {
		this.idMotif = idMotif;
	}

	public int getMotifArret() {
		return motifArret;
	}

	public void setMotifArret(int motifArret) {
		this.motifArret = motifArret;
	}

	public List<ArretCours> getArretsCours() {
		return arretsCours;
	}

	public void setArretsCours(List<ArretCours> arretsCours) {
		this.arretsCours = arretsCours;
	}

}
