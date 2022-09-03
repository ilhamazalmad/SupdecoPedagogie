package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class SerieBac {

private Long idSerie;
	private String serieBac;
	private String description;
private List<Etudiant> etudiants;

	public SerieBac() {
		super();
	}

	public SerieBac(Long idSerie, String serieBac, String description, List<Etudiant> etudiants) {
		super();
		this.idSerie = idSerie;
		this.serieBac = serieBac;
		this.description = description;
		this.etudiants = etudiants;
	}

	public Long getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	public String getSerieBac() {
		return serieBac;
	}

	public void setSerieBac(String serieBac) {
		this.serieBac = serieBac;
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
