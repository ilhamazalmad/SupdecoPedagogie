package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class ResponsableInscription {

private Long idResponsable;
	private String nom;
private List<Etudiant> etudiants;

	public ResponsableInscription() {
		super();
	}

	public ResponsableInscription(Long idResponsable, String nom, List<Etudiant> etudiants) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiants = etudiants;
	}

	public Long getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Long idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
