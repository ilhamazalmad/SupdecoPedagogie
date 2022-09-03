package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class GroupeAnnee {

private Long idGroupeAnnee;
private Niveau niveau;
private Annee annee;
private Groupe groupe;
private List<EtudiantAnnee> etudiantAnnees;
private List<AffectationMatiere> affectationMatieres;

	public GroupeAnnee() {
		super();
	}

	public GroupeAnnee(Long idGroupeAnnee, Niveau niveau, Annee annee, Groupe groupe, List<EtudiantAnnee> etudiantAnnees,
			List<AffectationMatiere> affectationMatieres) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.groupe = groupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public Long getIdGroupeAnnee() {
		return idGroupeAnnee;
	}

	public void setIdGroupeAnnee(Long idGroupeAnnee) {
		this.idGroupeAnnee = idGroupeAnnee;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

	public List<AffectationMatiere> getAffectationMatieres() {
		return affectationMatieres;
	}

	public void setAffectationMatieres(List<AffectationMatiere> affectationMatieres) {
		this.affectationMatieres = affectationMatieres;
	}

}