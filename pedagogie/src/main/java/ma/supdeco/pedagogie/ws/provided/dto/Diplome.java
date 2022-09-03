package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Diplome {

private Long idDiplome;
	private String titreDiplome;
private List<Etudiant> etudiants;

	public Diplome() {
		super();
	}

	public Diplome(Long idDiplome, String titreDiplome, List<Etudiant> etudiants) {
		super();
		this.idDiplome = idDiplome;
		this.titreDiplome = titreDiplome;
		this.etudiants = etudiants;
	}

	public Long getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(Long idDiplome) {
		this.idDiplome = idDiplome;
	}

	public String getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(String titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
