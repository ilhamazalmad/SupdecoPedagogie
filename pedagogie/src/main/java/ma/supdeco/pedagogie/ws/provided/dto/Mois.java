package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Mois {

private Long idMois;
	private String mois;
private List<Etudiant> etudiants;

	public Mois() {
		super();
	}

	public Mois(Long idMois, String mois, List<Etudiant> etudiants) {
		super();
		this.idMois = idMois;
		this.mois = mois;
		this.etudiants = etudiants;
	}

	public Long getIdMois() {
		return idMois;
	}

	public void setIdMois(Long idMois) {
		this.idMois = idMois;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
