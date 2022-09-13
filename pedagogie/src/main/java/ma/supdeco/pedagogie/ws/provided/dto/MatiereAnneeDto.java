package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class MatiereAnneeDto extends AuditableDto {

	private String idMatiereAnnee;
	private AnneeDto anneeDto;
	private MatiereDto matiereDto;
	private ModuleAnneeDto moduleAnneeDto;
	private List<ControleDto> controleDtos;
	private List<ExamenDto> examenDtos;
	private List<RachetageDto> rachetageDtos;
	private List<AffectationMatiereDto> affectationMatiereDtos;
	private List<NumerotationDto> numerotationDtos;

	public MatiereAnneeDto() {
		super();
	}

	public MatiereAnneeDto(String idMatiereAnnee, AnneeDto anneeDto, MatiereDto matiereDto, ModuleAnneeDto moduleAnneeDto,
			List<ControleDto> controleDtos, List<ExamenDto> examenDtos, List<RachetageDto> rachetageDtos,
			List<AffectationMatiereDto> affectationMatiereDtos, List<NumerotationDto> numerotationDtos) {
		super();
		this.idMatiereAnnee = idMatiereAnnee;
		this.anneeDto = anneeDto;
		this.matiereDto = matiereDto;
		this.moduleAnneeDto = moduleAnneeDto;
		this.controleDtos = controleDtos;
		this.examenDtos = examenDtos;
		this.rachetageDtos = rachetageDtos;
		this.affectationMatiereDtos = affectationMatiereDtos;
		this.numerotationDtos = numerotationDtos;
	}

	public String getIdMatiereAnnee() {
		return idMatiereAnnee;
	}

	public void setIdMatiereAnnee(String idMatiereAnnee) {
		this.idMatiereAnnee = idMatiereAnnee;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

	public MatiereDto getMatiere() {
		return matiereDto;
	}

	public void setMatiere(MatiereDto matiereDto) {
		this.matiereDto = matiereDto;
	}

	public ModuleAnneeDto getModuleAnnee() {
		return moduleAnneeDto;
	}

	public void setModuleAnnee(ModuleAnneeDto moduleAnneeDto) {
		this.moduleAnneeDto = moduleAnneeDto;
	}

	public List<ControleDto> getControles() {
		return controleDtos;
	}

	public void setControles(List<ControleDto> controleDtos) {
		this.controleDtos = controleDtos;
	}

	public List<ExamenDto> getExamens() {
		return examenDtos;
	}

	public void setExamens(List<ExamenDto> examenDtos) {
		this.examenDtos = examenDtos;
	}

	public List<RachetageDto> getRachetages() {
		return rachetageDtos;
	}

	public void setRachetages(List<RachetageDto> rachetageDtos) {
		this.rachetageDtos = rachetageDtos;
	}

	public List<AffectationMatiereDto> getAffectationMatieres() {
		return affectationMatiereDtos;
	}

	public void setAffectationMatieres(List<AffectationMatiereDto> affectationMatiereDtos) {
		this.affectationMatiereDtos = affectationMatiereDtos;
	}

	public List<NumerotationDto> getNumerotations() {
		return numerotationDtos;
	}

	public void setNumerotations(List<NumerotationDto> numerotationDtos) {
		this.numerotationDtos = numerotationDtos;
	}

}