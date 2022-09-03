package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Lycee {
	
private Long idLycee;
	private String nomLycee;
	private String typeLycee;
private List<Ville> villes;
private List<Etudiant> etudiants;

	public Lycee() {
		super();
	}

	public Lycee(Long idLycee, String nomLycee, String typeLycee, List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.idLycee = idLycee;
		this.nomLycee = nomLycee;
		this.typeLycee = typeLycee;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public Long getIdLycee() {
		return idLycee;
	}

	public void setIdLycee(Long idLycee) {
		this.idLycee = idLycee;
	}

	public String getNomLycee() {
		return nomLycee;
	}

	public void setNomLycee(String nomLycee) {
		this.nomLycee = nomLycee;
	}

	public String getTypeLycee() {
		return typeLycee;
	}

	public void setTypeLycee(String typeLycee) {
		this.typeLycee = typeLycee;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}


}
