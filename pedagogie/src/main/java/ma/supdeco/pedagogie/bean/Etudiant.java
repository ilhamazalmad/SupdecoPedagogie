package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Etudiant {
	   private int ins;
	   private String nom;
	   private String prenom;
	   private String cin;
	   private String cne;
	   private String photo;
	   private String sexe;
	   private String telephone;
	   private String adresse;
	   private String email;
	   private String emailSupdeco;
	   private Date dateNaissance;
	   private int lieuDeNaissance;
	   private Date dateInscription;
	   private String situation;
	   private int anneeBac;
	   private String lyceeBac;
	   private String typeLycee;
	   private String specialiteDiplome;
	   private int anneeDiplome;
	   private String etablissementDiplome;
	   private String typeEtablissement;
	   private boolean boursier;
	   private boolean resident;
	   private boolean handicape;
	   private boolean fonctionnaire;
	   private String posteOccupe;
	   
	   public EtudiantAnnee[] etudiantAnnee;
	   public java.util.Collection<Tuteur> tuteur;
	   
	   
	   /** @pdGenerated default getter */
	   public java.util.Collection<Tuteur> getTuteur() {
	      if (tuteur == null)
	         tuteur = new java.util.HashSet<Tuteur>();
	      return tuteur;
	   }
	   
	   /** @pdGenerated default iterator getter */
	   public java.util.Iterator getIteratorTuteur() {
	      if (tuteur == null)
	         tuteur = new java.util.HashSet<Tuteur>();
	      return tuteur.iterator();
	   }
	   
	   /** @pdGenerated default setter
	     * @param newTuteur */
	   public void setTuteur(java.util.Collection<Tuteur> newTuteur) {
	      removeAllTuteur();
	      for (java.util.Iterator iter = newTuteur.iterator(); iter.hasNext();)
	         addTuteur((Tuteur)iter.next());
	   }
	   
	   /** @pdGenerated default add
	     * @param newTuteur */
	   public void addTuteur(Tuteur newTuteur) {
	      if (newTuteur == null)
	         return;
	      if (this.tuteur == null)
	         this.tuteur = new java.util.HashSet<Tuteur>();
	      if (!this.tuteur.contains(newTuteur))
	         this.tuteur.add(newTuteur);
	   }
	   
	   /** @pdGenerated default remove
	     * @param oldTuteur */
	   public void removeTuteur(Tuteur oldTuteur) {
	      if (oldTuteur == null)
	         return;
	      if (this.tuteur != null)
	         if (this.tuteur.contains(oldTuteur))
	            this.tuteur.remove(oldTuteur);
	   }
	   
	   /** @pdGenerated default removeAll */
	   public void removeAllTuteur() {
	      if (tuteur != null)
	         tuteur.clear();
	   }
}
