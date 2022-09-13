package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "module")
@SQLDelete(sql = "UPDATE module SET deleted = true WHERE codeModule=?")
@Where(clause = "deleted=false")
public class Module extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeModule;
	private String nomModule;

	@OneToMany(mappedBy = "module", cascade = CascadeType.MERGE)
	private List<ModuleAnnee> moduleAnnees;

	private boolean deleted = Boolean.FALSE;

	public Module() {
		super();
	}

	public Module(String codeModule, String nomModule, List<ModuleAnnee> moduleAnnees) {
		super();
		this.codeModule = codeModule;
		this.nomModule = nomModule;
		this.moduleAnnees = moduleAnnees;
	}

	public Module(String codeModule, String nomModule, List<ModuleAnnee> moduleAnnees, boolean deleted) {
		super();
		this.codeModule = codeModule;
		this.nomModule = nomModule;
		this.moduleAnnees = moduleAnnees;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
