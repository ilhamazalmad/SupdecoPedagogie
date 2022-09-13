package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class OptionAnneeDto {

	private String idOptionAnnee;
	private OptionDto optionDto;
	private AnneeDto anneeDto;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<AffectationMatiereDto> affectationMatiereDtos;

	public OptionAnneeDto() {
		super();
	}

	public OptionAnneeDto(String idOptionAnnee, OptionDto optionDto, AnneeDto anneeDto, List<EtudiantAnneeDto> etudiantAnneeDtos,
			List<AffectationMatiereDto> affectationMatiereDtos) {
		super();
		this.idOptionAnnee = idOptionAnnee;
		this.optionDto = optionDto;
		this.anneeDto = anneeDto;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

	public String getIdOptionAnnee() {
		return idOptionAnnee;
	}

	public void setIdOptionAnnee(String idOptionAnnee) {
		this.idOptionAnnee = idOptionAnnee;
	}

	public OptionDto getOption() {
		return optionDto;
	}

	public void setOption(OptionDto optionDto) {
		this.optionDto = optionDto;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

	public List<EtudiantAnneeDto> getEtudiantAnnees() {
		return etudiantAnneeDtos;
	}

	public void setEtudiantAnnees(List<EtudiantAnneeDto> etudiantAnneeDtos) {
		this.etudiantAnneeDtos = etudiantAnneeDtos;
	}

	public List<AffectationMatiereDto> getAffectationMatieres() {
		return affectationMatiereDtos;
	}

	public void setAffectationMatieres(List<AffectationMatiereDto> affectationMatiereDtos) {
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

}