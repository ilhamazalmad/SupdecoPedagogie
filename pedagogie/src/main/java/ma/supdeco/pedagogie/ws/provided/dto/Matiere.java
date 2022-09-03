package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Matiere extends Auditable{

private String codeMatiere;
	private String titreMatiere;
private List<MatiereAnnee> matiereAnnee;

	public Matiere() {
		super();
	}

	public Matiere(String codeMatiere, String titreMatiere, List<MatiereAnnee> matiereAnnee) {
		super();
		this.codeMatiere = codeMatiere;
		this.titreMatiere = titreMatiere;
		this.matiereAnnee = matiereAnnee;
	}

	public String getCodeMatiere() {
		return codeMatiere;
	}

	public void setCodeMatiere(String codeMatiere) {
		this.codeMatiere = codeMatiere;
	}

	public String getTitreMatiere() {
		return titreMatiere;
	}

	public void setTitreMatiere(String titreMatiere) {
		this.titreMatiere = titreMatiere;
	}

	public List<MatiereAnnee> getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(List<MatiereAnnee> matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

}
