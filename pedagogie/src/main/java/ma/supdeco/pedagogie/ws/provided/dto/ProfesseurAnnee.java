package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class ProfesseurAnnee extends Auditable {

private Long idProfesseurAnnee;
private List<AffectationMatiere> affectationMatieres;
private Professeur professeur;
private Annee annee;

	public ProfesseurAnnee() {
		super();
	}

	public ProfesseurAnnee(Long idProfesseurAnnee, List<AffectationMatiere> affectationMatieres, Professeur professeur,
			Annee annee) {
		super();
		this.idProfesseurAnnee = idProfesseurAnnee;
		this.affectationMatieres = affectationMatieres;
		this.professeur = professeur;
		this.annee = annee;
	}

	public Long getIdProfesseurAnnee() {
		return idProfesseurAnnee;
	}

	public void setIdProfesseurAnnee(Long idProfesseurAnnee) {
		this.idProfesseurAnnee = idProfesseurAnnee;
	}

	public List<AffectationMatiere> getAffectationMatieres() {
		return affectationMatieres;
	}

	public void setAffectationMatieres(List<AffectationMatiere> affectationMatieres) {
		this.affectationMatieres = affectationMatieres;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

}