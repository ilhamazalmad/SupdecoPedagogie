package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class ModuleAnneeDto extends AuditableDto {

	private String idModuleAnnee;
	private AnneeDto anneeDto;
	private ModuleDto moduleDto;
	private SemestreNiveauDto semestreNiveauDto;
	private List<MatiereAnneeDto> matiereAnneeDtos;

	public ModuleAnneeDto() {
		super();
	}

	public ModuleAnneeDto(String idModuleAnnee, AnneeDto anneeDto, ModuleDto moduleDto, SemestreNiveauDto semestreNiveauDto,
			List<MatiereAnneeDto> matiereAnneeDtos) {
		super();
		this.idModuleAnnee = idModuleAnnee;
		this.anneeDto = anneeDto;
		this.moduleDto = moduleDto;
		this.semestreNiveauDto = semestreNiveauDto;
		this.matiereAnneeDtos = matiereAnneeDtos;
	}

	public String getIdModuleAnnee() {
		return idModuleAnnee;
	}

	public void setIdModuleAnnee(String idModuleAnnee) {
		this.idModuleAnnee = idModuleAnnee;
	}

	public AnneeDto getAnnee() {
		return anneeDto;
	}

	public void setAnnee(AnneeDto anneeDto) {
		this.anneeDto = anneeDto;
	}

	public ModuleDto getModule() {
		return moduleDto;
	}

	public void setModule(ModuleDto moduleDto) {
		this.moduleDto = moduleDto;
	}

	public SemestreNiveauDto getSemestreNiveau() {
		return semestreNiveauDto;
	}

	public void setSemestreNiveau(SemestreNiveauDto semestreNiveauDto) {
		this.semestreNiveauDto = semestreNiveauDto;
	}

	public List<MatiereAnneeDto> getMatiereAnnees() {
		return matiereAnneeDtos;
	}

	public void setMatiereAnnees(List<MatiereAnneeDto> matiereAnneeDtos) {
		this.matiereAnneeDtos = matiereAnneeDtos;
	}

}