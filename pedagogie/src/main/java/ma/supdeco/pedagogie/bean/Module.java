package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "module")
public class Module extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeModule;
	private String nomModule;

	@OneToMany(mappedBy = "module", cascade = CascadeType.MERGE)
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
