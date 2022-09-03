package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Annee {

private Long idAnnee;
	private String annee;
	private boolean active;
private List<ProfesseurAnnee> professeurAnnees;
private List<EtudiantAnnee> etudiantAnnees;
private List<GroupeAnnee> groupeAnnees;
private List<SousGroupeAnnee> sousGroupeAnnees;
private List<OptionAnnee> optionAnnees;
private List<ModuleAnnee> moduleAnnees;
private List<MatiereAnnee> matiereAnnees;
private List<SurveillantAnnee> surveillantAnnees;

	public Annee() {
		super();
	}

	public Annee(Long idAnnee, String annee, boolean active, List<ProfesseurAnnee> professeurAnnees,
			List<EtudiantAnnee> etudiantAnnees, List<GroupeAnnee> groupeAnnees, List<SousGroupeAnnee> sousGroupeAnnees,
			List<OptionAnnee> optionAnnees, List<ModuleAnnee> moduleAnnees, List<MatiereAnnee> matiereAnnees,
			List<SurveillantAnnee> surveillantAnnees) {
		super();
		this.idAnnee = idAnnee;
		this.annee = annee;
		this.active = active;
		this.professeurAnnees = professeurAnnees;
		this.etudiantAnnees = etudiantAnnees;
		this.groupeAnnees = groupeAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.optionAnnees = optionAnnees;
		this.moduleAnnees = moduleAnnees;
		this.matiereAnnees = matiereAnnees;
		this.surveillantAnnees = surveillantAnnees;
	}

	public Long getIdAnnee() {
		return idAnnee;
	}

	public void setIdAnnee(Long idAnnee) {
		this.idAnnee = idAnnee;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<ProfesseurAnnee> getProfesseurAnnees() {
		return professeurAnnees;
	}

	public void setProfesseurAnnees(List<ProfesseurAnnee> professeurAnnees) {
		this.professeurAnnees = professeurAnnees;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

	public List<GroupeAnnee> getGroupeAnnees() {
		return groupeAnnees;
	}

	public void setGroupeAnnees(List<GroupeAnnee> groupeAnnees) {
		this.groupeAnnees = groupeAnnees;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public List<OptionAnnee> getOptionAnnees() {
		return optionAnnees;
	}

	public void setOptionAnnees(List<OptionAnnee> optionAnnees) {
		this.optionAnnees = optionAnnees;
	}

	public List<ModuleAnnee> getModuleAnnees() {
		return moduleAnnees;
	}

	public void setModuleAnnees(List<ModuleAnnee> moduleAnnees) {
		this.moduleAnnees = moduleAnnees;
	}

	public List<MatiereAnnee> getMatiereAnnees() {
		return matiereAnnees;
	}

	public void setMatiereAnnees(List<MatiereAnnee> matiereAnnees) {
		this.matiereAnnees = matiereAnnees;
	}

	public List<SurveillantAnnee> getSurveillantAnnees() {
		return surveillantAnnees;
	}

	public void setSurveillantAnnees(List<SurveillantAnnee> surveillantAnnees) {
		this.surveillantAnnees = surveillantAnnees;
	}

}