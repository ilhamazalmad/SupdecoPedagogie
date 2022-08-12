package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "semestreNiveau")
public class SemestreNiveau {
   private int idSemestreNiveau;
   
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

}