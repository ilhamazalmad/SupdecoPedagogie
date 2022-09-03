package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class SpecialiteDiplome {

private Long idSpecialite;
	private String specialiteDiplome;
	private String description;
private List<Etudiant> etudiants;

	public SpecialiteDiplome() {
		super();
	}

	public SpecialiteDiplome(Long idSpecialite, String specialiteDiplome, String description, List<Etudiant> etudiants) {
		super();
		this.idSpecialite = idSpecialite;
		this.specialiteDiplome = specialiteDiplome;
		this.description = description;
		this.etudiants = etudiants;
	}

	public Long getIdSpecialite() {
		return idSpecialite;
	}

	public void setIdSpecialite(Long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}

	public String getSpecialiteDiplome() {
		return specialiteDiplome;
	}

	public void setSpecialiteDiplome(String specialiteDiplome) {
		this.specialiteDiplome = specialiteDiplome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
