package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Pays {

	private String codeIso3;
	private String pays;
private List<Ville> villes;
private List<Etudiant> etudiants;

	public Pays() {
		super();
	}

	public Pays(String codeIso3, String pays, List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.codeIso3 = codeIso3;
		this.pays = pays;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodeIso3() {
		return codeIso3;
	}

	public void setCodeIso3(String codeIso3) {
		this.codeIso3 = codeIso3;
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
