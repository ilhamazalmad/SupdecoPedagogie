package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class SousGroupeAnnee {

private Long idSsGroupeAnnee;
private Niveau niveau;
private Annee annee;
private SousGroupe sousGroupe;
private List<EtudiantAnnee> etudiantAnnees;
private List<AffectationMatiere> affectationMatieres;

	public SousGroupeAnnee() {
		super();
	}

	public SousGroupeAnnee(Long idSsGroupeAnnee, Niveau niveau, Annee annee, SousGroupe sousGroupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres) {
		super();
		this.idSsGroupeAnnee = idSsGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.sousGroupe = sousGroupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public Long getIdSsGroupeAnnee() {
		return idSsGroupeAnnee;
	}

	public void setIdSsGroupeAnnee(Long idSsGroupeAnnee) {
		this.idSsGroupeAnnee = idSsGroupeAnnee;
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

	public SousGroupe getSousGroupe() {
		return sousGroupe;
	}

	public void setSousGroupe(SousGroupe sousGroupe) {
		this.sousGroupe = sousGroupe;
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