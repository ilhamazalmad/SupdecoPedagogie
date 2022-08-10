package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prof")
public class Professeur implements Serializable{
	   private int idProfesseur;
	   private String nom;
	   private String prenom;
	   private String civilite;
	   private String statut;
	   private String telephone;
	   private String email;
	   private String adresse;
	   
	   public java.util.Collection<ProfesseurAnnee> professeurAnnee;
	   
	   
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

}
