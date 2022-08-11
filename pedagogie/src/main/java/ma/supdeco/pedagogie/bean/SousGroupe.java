package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sousGroupe")
public class SousGroupe implements Serializable{
	   public SousGroupe() {
		super();
	}

	public SousGroupe(int idSsGroupe, String ssGroupe, Collection<SousGroupeAnnee> sousGroupeAnnee) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnnee = sousGroupeAnnee;
	}

	private int idSsGroupe;
	   private String ssGroupe;
	   
	   public java.util.Collection<SousGroupeAnnee> sousGroupeAnnee;
	   
	   
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

	public int getIdSsGroupe() {
		return idSsGroupe;
	}

	public void setIdSsGroupe(int idSsGroupe) {
		this.idSsGroupe = idSsGroupe;
	}

	public String getSsGroupe() {
		return ssGroupe;
	}

	public void setSsGroupe(String ssGroupe) {
		this.ssGroupe = ssGroupe;
	}

}
