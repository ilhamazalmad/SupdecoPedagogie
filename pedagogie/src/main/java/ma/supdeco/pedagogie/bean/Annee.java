package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "annee")
public class Annee implements Serializable{
	private int idAnnee;
	   private String annee;
	   private boolean active;
	   
	   public java.util.Collection<ProfesseurAnnee> professeurAnnee;
	   public java.util.Collection<EtudiantAnnee> etudiantAnnee;
	   public java.util.Collection<GroupeAnnee> groupeAnnee;
	   public java.util.Collection<SousGroupeAnnee> sousGroupeAnnee;
	   public java.util.Collection<OptionAnnee> optionAnnee;
	   public java.util.Collection<ModuleAnnee> moduleAnnee;
	   public java.util.Collection<MatiereAnnee> matiereAnnee;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<ProfesseurAnnee> getProfesseurAnnee() {
	      if (professeurAnnee == null)
	         professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
	      return professeurAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorProfesseurAnnee() {
	      if (professeurAnnee == null)
	         professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
	      return professeurAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newProfesseurAnnee */
	   public void setProfesseurAnnee(java.util.Collection<ProfesseurAnnee> newProfesseurAnnee) {
	      removeAllProfesseurAnnee();
	      for (java.util.Iterator iter = newProfesseurAnnee.iterator(); iter.hasNext();)
	         addProfesseurAnnee((ProfesseurAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newProfesseurAnnee */
	   public void addProfesseurAnnee(ProfesseurAnnee newProfesseurAnnee) {
	      if (newProfesseurAnnee == null)
	         return;
	      if (this.professeurAnnee == null)
	         this.professeurAnnee = new java.util.HashSet<ProfesseurAnnee>();
	      if (!this.professeurAnnee.contains(newProfesseurAnnee))
	         this.professeurAnnee.add(newProfesseurAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldProfesseurAnnee */
	   public void removeProfesseurAnnee(ProfesseurAnnee oldProfesseurAnnee) {
	      if (oldProfesseurAnnee == null)
	         return;
	      if (this.professeurAnnee != null)
	         if (this.professeurAnnee.contains(oldProfesseurAnnee))
	            this.professeurAnnee.remove(oldProfesseurAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllProfesseurAnnee() {
	      if (professeurAnnee != null)
	         professeurAnnee.clear();
	   }
	   /** @pdGenerated default getter */
	   public java.util.Collection<EtudiantAnnee> getEtudiantAnnee() {
	      if (etudiantAnnee == null)
	         etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
	      return etudiantAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorEtudiantAnnee() {
	      if (etudiantAnnee == null)
	         etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
	      return etudiantAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newEtudiantAnnee */
	   public void setEtudiantAnnee(java.util.Collection<EtudiantAnnee> newEtudiantAnnee) {
	      removeAllEtudiantAnnee();
	      for (java.util.Iterator iter = newEtudiantAnnee.iterator(); iter.hasNext();)
	         addEtudiantAnnee((EtudiantAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newEtudiantAnnee */
	   public void addEtudiantAnnee(EtudiantAnnee newEtudiantAnnee) {
	      if (newEtudiantAnnee == null)
	         return;
	      if (this.etudiantAnnee == null)
	         this.etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
	      if (!this.etudiantAnnee.contains(newEtudiantAnnee))
	         this.etudiantAnnee.add(newEtudiantAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldEtudiantAnnee */
	   public void removeEtudiantAnnee(EtudiantAnnee oldEtudiantAnnee) {
	      if (oldEtudiantAnnee == null)
	         return;
	      if (this.etudiantAnnee != null)
	         if (this.etudiantAnnee.contains(oldEtudiantAnnee))
	            this.etudiantAnnee.remove(oldEtudiantAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllEtudiantAnnee() {
	      if (etudiantAnnee != null)
	         etudiantAnnee.clear();
	   }
	   /** @pdGenerated default getter */
	   public java.util.Collection<GroupeAnnee> getGroupeAnnee() {
	      if (groupeAnnee == null)
	         groupeAnnee = new java.util.HashSet<GroupeAnnee>();
	      return groupeAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorGroupeAnnee() {
	      if (groupeAnnee == null)
	         groupeAnnee = new java.util.HashSet<GroupeAnnee>();
	      return groupeAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newGroupeAnnee */
	   public void setGroupeAnnee(java.util.Collection<GroupeAnnee> newGroupeAnnee) {
	      removeAllGroupeAnnee();
	      for (java.util.Iterator iter = newGroupeAnnee.iterator(); iter.hasNext();)
	         addGroupeAnnee((GroupeAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newGroupeAnnee */
	   public void addGroupeAnnee(GroupeAnnee newGroupeAnnee) {
	      if (newGroupeAnnee == null)
	         return;
	      if (this.groupeAnnee == null)
	         this.groupeAnnee = new java.util.HashSet<GroupeAnnee>();
	      if (!this.groupeAnnee.contains(newGroupeAnnee))
	         this.groupeAnnee.add(newGroupeAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldGroupeAnnee */
	   public void removeGroupeAnnee(GroupeAnnee oldGroupeAnnee) {
	      if (oldGroupeAnnee == null)
	         return;
	      if (this.groupeAnnee != null)
	         if (this.groupeAnnee.contains(oldGroupeAnnee))
	            this.groupeAnnee.remove(oldGroupeAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllGroupeAnnee() {
	      if (groupeAnnee != null)
	         groupeAnnee.clear();
	   }
	   /** @pdGenerated default getter */
	   public java.util.Collection<SousGroupeAnnee> getSousGroupeAnnee() {
	      if (sousGroupeAnnee == null)
	         sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
	      return sousGroupeAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorSousGroupeAnnee() {
	      if (sousGroupeAnnee == null)
	         sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
	      return sousGroupeAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newSousGroupeAnnee */
	   public void setSousGroupeAnnee(java.util.Collection<SousGroupeAnnee> newSousGroupeAnnee) {
	      removeAllSousGroupeAnnee();
	      for (java.util.Iterator iter = newSousGroupeAnnee.iterator(); iter.hasNext();)
	         addSousGroupeAnnee((SousGroupeAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newSousGroupeAnnee */
	   public void addSousGroupeAnnee(SousGroupeAnnee newSousGroupeAnnee) {
	      if (newSousGroupeAnnee == null)
	         return;
	      if (this.sousGroupeAnnee == null)
	         this.sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
	      if (!this.sousGroupeAnnee.contains(newSousGroupeAnnee))
	         this.sousGroupeAnnee.add(newSousGroupeAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldSousGroupeAnnee */
	   public void removeSousGroupeAnnee(SousGroupeAnnee oldSousGroupeAnnee) {
	      if (oldSousGroupeAnnee == null)
	         return;
	      if (this.sousGroupeAnnee != null)
	         if (this.sousGroupeAnnee.contains(oldSousGroupeAnnee))
	            this.sousGroupeAnnee.remove(oldSousGroupeAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllSousGroupeAnnee() {
	      if (sousGroupeAnnee != null)
	         sousGroupeAnnee.clear();
	   }
	   /** @pdGenerated default getter */
	   public java.util.Collection<OptionAnnee> getOptionAnnee() {
	      if (optionAnnee == null)
	         optionAnnee = new java.util.HashSet<OptionAnnee>();
	      return optionAnnee;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorOptionAnnee() {
	      if (optionAnnee == null)
	         optionAnnee = new java.util.HashSet<OptionAnnee>();
	      return optionAnnee.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newOptionAnnee */
	   public void setOptionAnnee(java.util.Collection<OptionAnnee> newOptionAnnee) {
	      removeAllOptionAnnee();
	      for (java.util.Iterator iter = newOptionAnnee.iterator(); iter.hasNext();)
	         addOptionAnnee((OptionAnnee)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newOptionAnnee */
	   public void addOptionAnnee(OptionAnnee newOptionAnnee) {
	      if (newOptionAnnee == null)
	         return;
	      if (this.optionAnnee == null)
	         this.optionAnnee = new java.util.HashSet<OptionAnnee>();
	      if (!this.optionAnnee.contains(newOptionAnnee))
	         this.optionAnnee.add(newOptionAnnee);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldOptionAnnee */
	   public void removeOptionAnnee(OptionAnnee oldOptionAnnee) {
	      if (oldOptionAnnee == null)
	         return;
	      if (this.optionAnnee != null)
	         if (this.optionAnnee.contains(oldOptionAnnee))
	            this.optionAnnee.remove(oldOptionAnnee);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllOptionAnnee() {
	      if (optionAnnee != null)
	         optionAnnee.clear();
	   }
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
