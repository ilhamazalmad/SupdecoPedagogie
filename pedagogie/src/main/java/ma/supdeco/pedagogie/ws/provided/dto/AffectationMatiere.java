package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class AffectationMatiere {

	private Long idAffectation;
	private List<Seance> seances;
private List<GroupeAnnee> groupeAnnees;
private ProfesseurAnnee professeurAnnee;
private List<OptionAnnee> optionAnnees;
private List<SousGroupeAnnee> sousGroupeAnnees;
private MatiereAnnee matiereAnnee;

	public AffectationMatiere() {
		super();
	}

	public AffectationMatiere(Long idAffectation, List<Seance> seances, List<GroupeAnnee> groupeAnnees,
			ProfesseurAnnee professeurAnnee, List<OptionAnnee> optionAnnees, List<SousGroupeAnnee> sousGroupeAnnees,
			MatiereAnnee matiereAnnee) {
		super();
		this.idAffectation = idAffectation;
		this.seances = seances;
		this.groupeAnnees = groupeAnnees;
		this.professeurAnnee = professeurAnnee;
		this.optionAnnees = optionAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.matiereAnnee = matiereAnnee;
	}

	public Long getIdAffectation() {
		return idAffectation;
	}

	public void setIdAffectation(Long idAffectation) {
		this.idAffectation = idAffectation;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public List<GroupeAnnee> getGroupeAnnees() {
		return groupeAnnees;
	}

	public void setGroupeAnnees(List<GroupeAnnee> groupeAnnees) {
		this.groupeAnnees = groupeAnnees;
	}

	public ProfesseurAnnee getProfesseurAnnee() {
		return professeurAnnee;
	}

	public void setProfesseurAnnee(ProfesseurAnnee professeurAnnee) {
		this.professeurAnnee = professeurAnnee;
	}

	public List<OptionAnnee> getOptionAnnees() {
		return optionAnnees;
	}

	public void setOptionAnnees(List<OptionAnnee> optionAnnees) {
		this.optionAnnees = optionAnnees;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public MatiereAnnee getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(MatiereAnnee matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

}
