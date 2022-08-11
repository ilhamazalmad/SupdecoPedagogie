package ma.supdeco.pedagogie.bean;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="niveauAdmission")

public class NiveauAdmission {
	public NiveauAdmission() {
		super();
	}

	public NiveauAdmission(int idAdmission, String niveauAdmission, Collection<Etudiant> etudiant) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiant = etudiant;
	}

	private int idAdmission;
	   private String niveauAdmission;
	   
	   public java.util.Collection<Etudiant> etudiant;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Etudiant> getEtudiant() {
	      if (etudiant == null)
	         etudiant = new java.util.HashSet<Etudiant>();
	      return etudiant;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorEtudiant() {
	      if (etudiant == null)
	         etudiant = new java.util.HashSet<Etudiant>();
	      return etudiant.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newEtudiant */
	   public void setEtudiant(java.util.Collection<Etudiant> newEtudiant) {
	      removeAllEtudiant();
	      for (java.util.Iterator iter = newEtudiant.iterator(); iter.hasNext();)
	         addEtudiant((Etudiant)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newEtudiant */
	   public void addEtudiant(Etudiant newEtudiant) {
	      if (newEtudiant == null)
	         return;
	      if (this.etudiant == null)
	         this.etudiant = new java.util.HashSet<Etudiant>();
	      if (!this.etudiant.contains(newEtudiant))
	         this.etudiant.add(newEtudiant);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldEtudiant */
	   public void removeEtudiant(Etudiant oldEtudiant) {
	      if (oldEtudiant == null)
	         return;
	      if (this.etudiant != null)
	         if (this.etudiant.contains(oldEtudiant))
	            this.etudiant.remove(oldEtudiant);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllEtudiant() {
	      if (etudiant != null)
	         etudiant.clear();
	   }

	public int getIdAdmission() {
		return idAdmission;
	}

	public void setIdAdmission(int idAdmission) {
		this.idAdmission = idAdmission;
	}

	public String getNiveauAdmission() {
		return niveauAdmission;
	}

	public void setNiveauAdmission(String niveauAdmission) {
		this.niveauAdmission = niveauAdmission;
	}
}
