package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class ModuleDto extends AuditableDto {

	private String codeModule;
	private String nomModule;
	private List<ModuleAnneeDto> moduleAnneeDtos;

	public ModuleDto() {
		super();
	}

	public ModuleDto(String codeModule, String nomModule, List<ModuleAnneeDto> moduleAnneeDtos) {
		super();
		this.codeModule = codeModule;
		this.nomModule = nomModule;
		this.moduleAnneeDtos = moduleAnneeDtos;
	}

	public String getCodeModule() {
		return codeModule;
	}

	public void setCodeModule(String codeModule) {
		this.codeModule = codeModule;
	}

	public String getNomModule() {
		return nomModule;
	}

	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}

	public List<ModuleAnneeDto> getModuleAnnees() {
		return moduleAnneeDtos;
	}

	public void setModuleAnnees(List<ModuleAnneeDto> moduleAnneeDtos) {
		this.moduleAnneeDtos = moduleAnneeDtos;
	}

}
