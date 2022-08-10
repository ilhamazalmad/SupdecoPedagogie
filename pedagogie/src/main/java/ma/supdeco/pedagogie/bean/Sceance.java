package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sceance")

public class Sceance implements Serializable{
	   private int idSeance;
	   private String disponibilite;
	   private boolean stop;
	   private int heureDebut;
	   private int heureFin;
	   
	   public java.util.Collection<Fiche> fiche;
	   public java.util.Collection<RattrapageSeance> rattrapageSeance;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Fiche> getFiche() {
	      if (fiche == null)
	         fiche = new java.util.HashSet<Fiche>();
	      return fiche;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorFiche() {
	      if (fiche == null)
	         fiche = new java.util.HashSet<Fiche>();
	      return fiche.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newFiche */
	   public void setFiche(java.util.Collection<Fiche> newFiche) {
	      removeAllFiche();
	      for (java.util.Iterator iter = newFiche.iterator(); iter.hasNext();)
	         addFiche((Fiche)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newFiche */
	   public void addFiche(Fiche newFiche) {
	      if (newFiche == null)
	         return;
	      if (this.fiche == null)
	         this.fiche = new java.util.HashSet<Fiche>();
	      if (!this.fiche.contains(newFiche))
	         this.fiche.add(newFiche);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldFiche */
	   public void removeFiche(Fiche oldFiche) {
	      if (oldFiche == null)
	         return;
	      if (this.fiche != null)
	         if (this.fiche.contains(oldFiche))
	            this.fiche.remove(oldFiche);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllFiche() {
	      if (fiche != null)
	         fiche.clear();
	   }
	   /** @pdGenerated default getter */
	   public java.util.Collection<RattrapageSeance> getRattrapageSeance() {
	      if (rattrapageSeance == null)
	         rattrapageSeance = new java.util.HashSet<RattrapageSeance>();
	      return rattrapageSeance;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorRattrapageSeance() {
	      if (rattrapageSeance == null)
	         rattrapageSeance = new java.util.HashSet<RattrapageSeance>();
	      return rattrapageSeance.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newRattrapageSeance */
	   public void setRattrapageSeance(java.util.Collection<RattrapageSeance> newRattrapageSeance) {
	      removeAllRattrapageSeance();
	      for (java.util.Iterator iter = newRattrapageSeance.iterator(); iter.hasNext();)
	         addRattrapageSeance((RattrapageSeance)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newRattrapageSeance */
	   public void addRattrapageSeance(RattrapageSeance newRattrapageSeance) {
	      if (newRattrapageSeance == null)
	         return;
	      if (this.rattrapageSeance == null)
	         this.rattrapageSeance = new java.util.HashSet<RattrapageSeance>();
	      if (!this.rattrapageSeance.contains(newRattrapageSeance))
	         this.rattrapageSeance.add(newRattrapageSeance);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldRattrapageSeance */
	   public void removeRattrapageSeance(RattrapageSeance oldRattrapageSeance) {
	      if (oldRattrapageSeance == null)
	         return;
	      if (this.rattrapageSeance != null)
	         if (this.rattrapageSeance.contains(oldRattrapageSeance))
	            this.rattrapageSeance.remove(oldRattrapageSeance);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllRattrapageSeance() {
	      if (rattrapageSeance != null)
	         rattrapageSeance.clear();
	   }

}