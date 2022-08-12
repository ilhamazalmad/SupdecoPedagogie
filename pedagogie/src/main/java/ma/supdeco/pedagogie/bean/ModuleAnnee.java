package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moduleAnnee")
public class ModuleAnnee {
   private int idModuleAnnee;
   private String codeModule;
   
   public java.util.Collection<MatiereAnnee> matiereAnnee;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<MatiereAnnee> getMatiereAnnee() {
      if (matiereAnnee == null)
         matiereAnnee = new java.util.HashSet<MatiereAnnee>();
      return matiereAnnee;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorMatiereAnnee() {
      if (matiereAnnee == null)
         matiereAnnee = new java.util.HashSet<MatiereAnnee>();
      return matiereAnnee.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newMatiereAnnee */
   public void setMatiereAnnee(java.util.Collection<MatiereAnnee> newMatiereAnnee) {
      removeAllMatiereAnnee();
      for (java.util.Iterator iter = newMatiereAnnee.iterator(); iter.hasNext();)
         addMatiereAnnee((MatiereAnnee)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newMatiereAnnee */
   public void addMatiereAnnee(MatiereAnnee newMatiereAnnee) {
      if (newMatiereAnnee == null)
         return;
      if (this.matiereAnnee == null)
         this.matiereAnnee = new java.util.HashSet<MatiereAnnee>();
      if (!this.matiereAnnee.contains(newMatiereAnnee))
         this.matiereAnnee.add(newMatiereAnnee);
   }
   
   /** @pdGenerated default remove
     * @param oldMatiereAnnee */
   public void removeMatiereAnnee(MatiereAnnee oldMatiereAnnee) {
      if (oldMatiereAnnee == null)
         return;
      if (this.matiereAnnee != null)
         if (this.matiereAnnee.contains(oldMatiereAnnee))
            this.matiereAnnee.remove(oldMatiereAnnee);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllMatiereAnnee() {
      if (matiereAnnee != null)
         matiereAnnee.clear();
   }

}