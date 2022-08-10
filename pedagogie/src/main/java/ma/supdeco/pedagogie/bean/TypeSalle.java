package ma.supdeco.pedagogie.bean;

public class TypeSalle {
	  private int idType;
	   private String typeSalle;
	   
	   public java.util.Collection<Salle> salle;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Salle> getSalle() {
	      if (salle == null)
	         salle = new java.util.HashSet<Salle>();
	      return salle;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorSalle() {
	      if (salle == null)
	         salle = new java.util.HashSet<Salle>();
	      return salle.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newSalle */
	   public void setSalle(java.util.Collection<Salle> newSalle) {
	      removeAllSalle();
	      for (java.util.Iterator iter = newSalle.iterator(); iter.hasNext();)
	         addSalle((Salle)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newSalle */
	   public void addSalle(Salle newSalle) {
	      if (newSalle == null)
	         return;
	      if (this.salle == null)
	         this.salle = new java.util.HashSet<Salle>();
	      if (!this.salle.contains(newSalle))
	         this.salle.add(newSalle);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldSalle */
	   public void removeSalle(Salle oldSalle) {
	      if (oldSalle == null)
	         return;
	      if (this.salle != null)
	         if (this.salle.contains(oldSalle))
	            this.salle.remove(oldSalle);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllSalle() {
	      if (salle != null)
	         salle.clear();
	   }

}
