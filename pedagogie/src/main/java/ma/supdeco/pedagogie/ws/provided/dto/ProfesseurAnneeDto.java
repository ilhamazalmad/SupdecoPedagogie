package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class ProfesseurAnneeDto extends AuditableDto {

	private String idProfesseurAnnee;
	private List<AffectationMatiereDto> affectationMatiereDtos;
	private ProfesseurDto professeurDto;
	private AnneeDto anneeDto;

	public ProfesseurAnneeDto() {
		super();
	}

	public ProfesseurAnneeDto(String idProfesseurAnnee, List<AffectationMatiereDto> affectationMatiereDtos,
			ProfesseurDto professeurDto, AnneeDto anneeDto) {
		super();
		this.idProfesseurAnnee = idProfesseurAnnee;
		this.affectationMatiereDtos = affectationMatiereDtos;
		this.professeurDto = professeurDto;
		this.anneeDto = anneeDto;
	}

	public String getIdProfesseurAnnee() {
		return idProfesseurAnnee;
	}

	public void setIdProfesseurAnnee(String idProfesseurAnnee) {
		this.idProfesseurAnnee = idProfesseurAnnee;
	}

	public List<AffectationMatiereDto> getAffectationMatieres() {
		return affectationMatiereDtos;
	}

	public void setAffectationMatieres(List<AffectationMatiereDto> affectationMatiereDtos) {
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

	public ProfesseurDto getProfesseur() {
		return professeurDto;
	}

	public void setProfesseur(ProfesseurDto professeurDto) {
		this.professeurDto = professeurDto;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

}