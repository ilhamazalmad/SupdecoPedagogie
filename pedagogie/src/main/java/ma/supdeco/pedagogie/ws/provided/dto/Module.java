package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Module extends Auditable{

private String codeModule;
	private String nomModule;
private List<ModuleAnnee> moduleAnnees;

	public Module() {
		super();
	}

	public Module(String codeModule, String nomModule, List<ModuleAnnee> moduleAnnees) {
		super();
		this.codeModule = codeModule;
		this.nomModule = nomModule;
		this.moduleAnnees = moduleAnnees;
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

	public List<ModuleAnnee> getModuleAnnees() {
		return moduleAnnees;
	}

	public void setModuleAnnees(List<ModuleAnnee> moduleAnnees) {
		this.moduleAnnees = moduleAnnees;
	}

}
