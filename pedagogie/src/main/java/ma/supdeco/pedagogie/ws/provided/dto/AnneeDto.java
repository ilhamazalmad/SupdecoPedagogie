package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class AnneeDto {

	private Long idAnnee;
	private String annee;
	private String active;
	private List<ProfesseurAnneeDto> professeurAnneeDtos;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<GroupeAnneeDto> groupeAnneeDtos;
	private List<SousGroupeAnneeDto> sousGroupeAnneeDtos;
	private List<OptionAnneeDto> optionAnneeDtos;
	private List<ModuleAnneeDto> moduleAnneeDtos;
	private List<MatiereAnneeDto> matiereAnneeDtos;
	private List<SurveillantAnneeDto> surveillantAnneeDtos;

	public AnneeDto() {
		super();
	}

	public AnneeDto(Long idAnnee, String annee, String active, List<ProfesseurAnneeDto> professeurAnneeDtos,
			List<EtudiantAnneeDto> etudiantAnneeDtos, List<GroupeAnneeDto> groupeAnneeDtos, List<SousGroupeAnneeDto> sousGroupeAnneeDtos,
			List<OptionAnneeDto> optionAnneeDtos, List<ModuleAnneeDto> moduleAnneeDtos, List<MatiereAnneeDto> matiereAnneeDtos,
			List<SurveillantAnneeDto> surveillantAnneeDtos) {
		super();
		this.idAnnee = idAnnee;
		this.annee = annee;
		this.active = active;
		this.professeurAnneeDtos = professeurAnneeDtos;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.groupeAnneeDtos = groupeAnneeDtos;
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
		this.optionAnneeDtos = optionAnneeDtos;
		this.moduleAnneeDtos = moduleAnneeDtos;
		this.matiereAnneeDtos = matiereAnneeDtos;
		this.surveillantAnneeDtos = surveillantAnneeDtos;
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

	public String isActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public List<ProfesseurAnneeDto> getProfesseurAnnees() {
		return professeurAnneeDtos;
	}

	public void setProfesseurAnnees(List<ProfesseurAnneeDto> professeurAnneeDtos) {
		this.professeurAnneeDtos = professeurAnneeDtos;
	}

	public List<EtudiantAnneeDto> getEtudiantAnnees() {
		return etudiantAnneeDtos;
	}

	public void setEtudiantAnnees(List<EtudiantAnneeDto> etudiantAnneeDtos) {
		this.etudiantAnneeDtos = etudiantAnneeDtos;
	}

	public List<GroupeAnneeDto> getGroupeAnnees() {
		return groupeAnneeDtos;
	}

	public void setGroupeAnnees(List<GroupeAnneeDto> groupeAnneeDtos) {
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

	public List<SousGroupeAnneeDto> getSousGroupeAnnees() {
		return sousGroupeAnneeDtos;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

	public List<OptionAnneeDto> getOptionAnnees() {
		return optionAnneeDtos;
	}

	public void setOptionAnnees(List<OptionAnneeDto> optionAnneeDtos) {
		this.optionAnneeDtos = optionAnneeDtos;
	}

	public List<ModuleAnneeDto> getModuleAnnees() {
		return moduleAnneeDtos;
	}

	public void setModuleAnnees(List<ModuleAnneeDto> moduleAnneeDtos) {
		this.moduleAnneeDtos = moduleAnneeDtos;
	}

	public List<MatiereAnneeDto> getMatiereAnnees() {
		return matiereAnneeDtos;
	}

	public void setMatiereAnnees(List<MatiereAnneeDto> matiereAnneeDtos) {
		this.matiereAnneeDtos = matiereAnneeDtos;
	}

	public List<SurveillantAnneeDto> getSurveillantAnnees() {
		return surveillantAnneeDtos;
	}

	public void setSurveillantAnnees(List<SurveillantAnneeDto> surveillantAnneeDtos) {
		this.surveillantAnneeDtos = surveillantAnneeDtos;
	}

}