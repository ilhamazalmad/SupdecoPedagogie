package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "annee")
public class Annee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAnnee;
	private String annee;
	private boolean active;

	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<ProfesseurAnnee> professeurAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<EtudiantAnnee> etudiantAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<GroupeAnnee> groupeAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<SousGroupeAnnee> sousGroupeAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<OptionAnnee> optionAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<ModuleAnnee> moduleAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<MatiereAnnee> matiereAnnees;
	
	@OneToMany(mappedBy="annee",cascade = CascadeType.MERGE)
	public List<SurveillantAnnee> surveillantsAnnees;

	
	
	public Annee() {
		super();
	}

	public Annee(int idAnnee, String annee, boolean active, List<ProfesseurAnnee> professeurAnnees,
			List<EtudiantAnnee> etudiantAnnees, List<GroupeAnnee> groupeAnnees, List<SousGroupeAnnee> sousGroupeAnnees,
			List<OptionAnnee> optionAnnees, List<ModuleAnnee> moduleAnnees, List<MatiereAnnee> matiereAnnees,
			List<SurveillantAnnee> surveillantsAnnees) {
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
		this.surveillantsAnnees = surveillantsAnnees;
	}

	public int getIdAnnee() {
		return idAnnee;
	}

	public void setIdAnnee(int idAnnee) {
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

	public List<SurveillantAnnee> getSurveillantsAnnees() {
		return surveillantsAnnees;
	}

	public void setSurveillantsAnnees(List<SurveillantAnnee> surveillantsAnnees) {
		this.surveillantsAnnees = surveillantsAnnees;
	}
	
	

}