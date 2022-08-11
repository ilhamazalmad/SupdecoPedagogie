package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "module")

public class Module implements Serializable{
	public Module() {
		super();
	}

	public Module(String codeModule, String nomModule, Collection<ModuleAnnee> moduleAnnee) {
		super();
		this.codeModule = codeModule;
		this.nomModule = nomModule;
		this.moduleAnnee = moduleAnnee;
	}

	private String codeModule;
	   private String nomModule;
	   
	   public java.util.Collection<ModuleAnnee> moduleAnnee;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<ModuleAnnee> getModuleAnnee() {
	      if (moduleAnnee == null)
	         moduleAnnee = new java.util.HashSet<ModuleAnnee>();
	      return moduleAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorModuleAnnee() {
	      if (moduleAnnee == null)
	         moduleAnnee = new java.util.HashSet<ModuleAnnee>();
	      return moduleAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newModuleAnnee */
	   public void setModuleAnnee(java.util.Collection<ModuleAnnee> newModuleAnnee) {
	      removeAllModuleAnnee();
	      for (java.util.Iterator iter = newModuleAnnee.iterator(); iter.hasNext();)
	         addModuleAnnee((ModuleAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newModuleAnnee */
	   public void addModuleAnnee(ModuleAnnee newModuleAnnee) {
	      if (newModuleAnnee == null)
	         return;
	      if (this.moduleAnnee == null)
	         this.moduleAnnee = new java.util.HashSet<ModuleAnnee>();
	      if (!this.moduleAnnee.contains(newModuleAnnee))
	         this.moduleAnnee.add(newModuleAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldModuleAnnee */
	   public void removeModuleAnnee(ModuleAnnee oldModuleAnnee) {
	      if (oldModuleAnnee == null)
	         return;
	      if (this.moduleAnnee != null)
	         if (this.moduleAnnee.contains(oldModuleAnnee))
	            this.moduleAnnee.remove(oldModuleAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllModuleAnnee() {
	      if (moduleAnnee != null)
	         moduleAnnee.clear();
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
}
