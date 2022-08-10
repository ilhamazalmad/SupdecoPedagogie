package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe implements Serializable{
	   private int idGroupe;
	   private String nomGroupe;
	   
	   public java.util.Collection<GroupeAnnee> groupeAnnee;
	   
	   
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

}
