package ma.supdeco.pedagogie.bean;

public class TypeSeance {
	   private int codeType;
	   private String typeSeance;
	   
	   public java.util.Collection<Seance> seance;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Seance> getSeance() {
	      if (seance == null)
	         seance = new java.util.HashSet<Seance>();
	      return seance;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorSeance() {
	      if (seance == null)
	         seance = new java.util.HashSet<Seance>();
	      return seance.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newSeance */
	   public void setSeance(java.util.Collection<Seance> newSeance) {
	      removeAllSeance();
	      for (java.util.Iterator iter = newSeance.iterator(); iter.hasNext();)
	         addSeance((Seance)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newSeance */
	   public void addSeance(Seance newSeance) {
	      if (newSeance == null)
	         return;
	      if (this.seance == null)
	         this.seance = new java.util.HashSet<Seance>();
	      if (!this.seance.contains(newSeance))
	         this.seance.add(newSeance);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldSeance */
	   public void removeSeance(Seance oldSeance) {
	      if (oldSeance == null)
	         return;
	      if (this.seance != null)
	         if (this.seance.contains(oldSeance))
	            this.seance.remove(oldSeance);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllSeance() {
	      if (seance != null)
	         seance.clear();
	   }

}
