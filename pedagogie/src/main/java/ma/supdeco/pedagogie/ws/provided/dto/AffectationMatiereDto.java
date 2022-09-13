package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class AffectationMatiereDto {

	private String idAffectation;
	private List<SeanceDto> seanceDtos;
	private List<GroupeAnneeDto> groupeAnneeDtos;
	private ProfesseurAnneeDto professeurAnneeDto;
	private List<OptionAnneeDto> optionAnneeDtos;
	private List<SousGroupeAnneeDto> sousGroupeAnneeDtos;
	private MatiereAnneeDto matiereAnneeDto;

	public AffectationMatiereDto() {
		super();
	}

	public AffectationMatiereDto(String idAffectation, List<SeanceDto> seanceDtos, List<GroupeAnneeDto> groupeAnneeDtos,
			ProfesseurAnneeDto professeurAnneeDto, List<OptionAnneeDto> optionAnneeDtos, List<SousGroupeAnneeDto> sousGroupeAnneeDtos,
			MatiereAnneeDto matiereAnneeDto) {
		super();
		this.idAffectation = idAffectation;
		this.seanceDtos = seanceDtos;
		this.groupeAnneeDtos = groupeAnneeDtos;
		this.professeurAnneeDto = professeurAnneeDto;
		this.optionAnneeDtos = optionAnneeDtos;
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
		this.matiereAnneeDto = matiereAnneeDto;
	}

	public String getIdAffectation() {
		return idAffectation;
	}

	public void setIdAffectation(String idAffectation) {
		this.idAffectation = idAffectation;
	}

	public List<SeanceDto> getSeances() {
		return seanceDtos;
	}

	public void setSeances(List<SeanceDto> seanceDtos) {
		this.seanceDtos = seanceDtos;
	}

	public List<GroupeAnneeDto> getGroupeAnnees() {
		return groupeAnneeDtos;
	}

	public void setGroupeAnnees(List<GroupeAnneeDto> groupeAnneeDtos) {
		this.groupeAnneeDtos = groupeAnneeDtos;
	}

	public ProfesseurAnneeDto getProfesseurAnnee() {
		return professeurAnneeDto;
	}

	public void setProfesseurAnnee(ProfesseurAnneeDto professeurAnneeDto) {
		this.professeurAnneeDto = professeurAnneeDto;
	}

	public List<OptionAnneeDto> getOptionAnnees() {
		return optionAnneeDtos;
	}

	public void setOptionAnnees(List<OptionAnneeDto> optionAnneeDtos) {
		this.optionAnneeDtos = optionAnneeDtos;
	}

	public List<SousGroupeAnneeDto> getSousGroupeAnnees() {
		return sousGroupeAnneeDtos;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

	public MatiereAnneeDto getMatiereAnnee() {
		return matiereAnneeDto;
	}

	public void setMatiereAnnee(MatiereAnneeDto matiereAnneeDto) {
		this.matiereAnneeDto = matiereAnneeDto;
	}

}
