package ma.supdeco.pedagogie.bean;

public class SerieBac {
	   private int idSerie;
	   private String serieBac;
	   private String description;
	   
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

}
