package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class NiveauAdmission {

private Long idAdmission;
	private String niveauAdmission;
private List<Etudiant> etudiants;

	public NiveauAdmission() {
		super();
	}

	public NiveauAdmission(Long idAdmission, String niveauAdmission, List<Etudiant> etudiants) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiants = etudiants;
	}

	public Long getIdAdmission() {
		return idAdmission;
	}

	public void setIdAdmission(Long idAdmission) {
		this.idAdmission = idAdmission;
	}

	public String getNiveauAdmission() {
		return niveauAdmission;
	}

	public void setNiveauAdmission(String niveauAdmission) {
		this.niveauAdmission = niveauAdmission;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
