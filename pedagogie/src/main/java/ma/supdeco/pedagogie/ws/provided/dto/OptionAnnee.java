package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class OptionAnnee {

private Long idOptionAnnee;
private Option option;
private Annee annee;
private List<EtudiantAnnee> etudiantAnnees;
private List<AffectationMatiere> affectationMatieres ;

	public OptionAnnee() {
		super();
	}

	public OptionAnnee(Long idOptionAnnee, Option option, Annee annee, List<EtudiantAnnee> etudiantAnnees,
			List<AffectationMatiere> affectationMatieres) {
		super();
		this.idOptionAnnee = idOptionAnnee;
		this.option = option;
		this.annee = annee;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public Long getIdOptionAnnee() {
		return idOptionAnnee;
	}

	public void setIdOptionAnnee(Long idOptionAnnee) {
		this.idOptionAnnee = idOptionAnnee;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
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