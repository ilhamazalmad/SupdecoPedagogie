package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pays")
public class Pays implements Serializable{
	   public Pays() {
		super();
	}

	public Pays(int idPays, String pays, String codeIso3, Collection<Ville> ville, Collection<Etudiant> etudiant) {
		super();
		this.idPays = idPays;
		this.pays = pays;
		this.codeIso3 = codeIso3;
		this.ville = ville;
		this.etudiant = etudiant;
	}

	private int idPays;
	   private String pays;
	   private String codeIso3;
	   
	   public java.util.Collection<Ville> ville;
	   public java.util.Collection<Etudiant> etudiant;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Ville> getVille() {
	      if (ville == null)
	         ville = new java.util.HashSet<Ville>();
	      return ville;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorVille() {
	      if (ville == null)
	         ville = new java.util.HashSet<Ville>();
	      return ville.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newVille */
	   public void setVille(java.util.Collection<Ville> newVille) {
	      removeAllVille();
	      for (java.util.Iterator iter = newVille.iterator(); iter.hasNext();)
	         addVille((Ville)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newVille */
	   public void addVille(Ville newVille) {
	      if (newVille == null)
	         return;
	      if (this.ville == null)
	         this.ville = new java.util.HashSet<Ville>();
	      if (!this.ville.contains(newVille))
	         this.ville.add(newVille);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldVille */
	   public void removeVille(Ville oldVille) {
	      if (oldVille == null)
	         return;
	      if (this.ville != null)
	         if (this.ville.contains(oldVille))
	            this.ville.remove(oldVille);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllVille() {
	      if (ville != null)
	         ville.clear();
	   }
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

	public int getIdPays() {
		return idPays;
	}

	public void setIdPays(int idPays) {
		this.idPays = idPays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodeIso3() {
		return codeIso3;
	}

	public void setCodeIso3(String codeIso3) {
		this.codeIso3 = codeIso3;
	}

}
