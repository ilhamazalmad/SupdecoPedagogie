package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "matiereAnnee")
public class MatiereAnnee {
   private int idMatiereAnnee;
   private String codeMatiere;
   
   public java.util.Collection<Controle> controle;
   public java.util.Collection<Examen> examen;
   public java.util.Collection<Rachetage> rachetage;
   public java.util.Collection<AffectationMatiere> affectationMatiere;
   public java.util.Collection<Numerotation> numerotation;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Controle> getControle() {
      if (controle == null)
         controle = new java.util.HashSet<Controle>();
      return controle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorControle() {
      if (controle == null)
         controle = new java.util.HashSet<Controle>();
      return controle.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newControle */
   public void setControle(java.util.Collection<Controle> newControle) {
      removeAllControle();
      for (java.util.Iterator iter = newControle.iterator(); iter.hasNext();)
         addControle((Controle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newControle */
   public void addControle(Controle newControle) {
      if (newControle == null)
         return;
      if (this.controle == null)
         this.controle = new java.util.HashSet<Controle>();
      if (!this.controle.contains(newControle))
         this.controle.add(newControle);
   }
   
   /** @pdGenerated default remove
     * @param oldControle */
   public void removeControle(Controle oldControle) {
      if (oldControle == null)
         return;
      if (this.controle != null)
         if (this.controle.contains(oldControle))
            this.controle.remove(oldControle);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllControle() {
      if (controle != null)
         controle.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Examen> getExamen() {
      if (examen == null)
         examen = new java.util.HashSet<Examen>();
      return examen;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorExamen() {
      if (examen == null)
         examen = new java.util.HashSet<Examen>();
      return examen.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newExamen */
   public void setExamen(java.util.Collection<Examen> newExamen) {
      removeAllExamen();
      for (java.util.Iterator iter = newExamen.iterator(); iter.hasNext();)
         addExamen((Examen)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newExamen */
   public void addExamen(Examen newExamen) {
      if (newExamen == null)
         return;
      if (this.examen == null)
         this.examen = new java.util.HashSet<Examen>();
      if (!this.examen.contains(newExamen))
         this.examen.add(newExamen);
   }
   
   /** @pdGenerated default remove
     * @param oldExamen */
   public void removeExamen(Examen oldExamen) {
      if (oldExamen == null)
         return;
      if (this.examen != null)
         if (this.examen.contains(oldExamen))
            this.examen.remove(oldExamen);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllExamen() {
      if (examen != null)
         examen.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Rachetage> getRachetage() {
      if (rachetage == null)
         rachetage = new java.util.HashSet<Rachetage>();
      return rachetage;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRachetage() {
      if (rachetage == null)
         rachetage = new java.util.HashSet<Rachetage>();
      return rachetage.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRachetage */
   public void setRachetage(java.util.Collection<Rachetage> newRachetage) {
      removeAllRachetage();
      for (java.util.Iterator iter = newRachetage.iterator(); iter.hasNext();)
         addRachetage((Rachetage)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRachetage */
   public void addRachetage(Rachetage newRachetage) {
      if (newRachetage == null)
         return;
      if (this.rachetage == null)
         this.rachetage = new java.util.HashSet<Rachetage>();
      if (!this.rachetage.contains(newRachetage))
         this.rachetage.add(newRachetage);
   }
   
   /** @pdGenerated default remove
     * @param oldRachetage */
   public void removeRachetage(Rachetage oldRachetage) {
      if (oldRachetage == null)
         return;
      if (this.rachetage != null)
         if (this.rachetage.contains(oldRachetage))
            this.rachetage.remove(oldRachetage);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRachetage() {
      if (rachetage != null)
         rachetage.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<AffectationMatiere> getAffectationMatiere() {
      if (affectationMatiere == null)
         affectationMatiere = new java.util.HashSet<AffectationMatiere>();
      return affectationMatiere;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAffectationMatiere() {
      if (affectationMatiere == null)
         affectationMatiere = new java.util.HashSet<AffectationMatiere>();
      return affectationMatiere.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAffectationMatiere */
   public void setAffectationMatiere(java.util.Collection<AffectationMatiere> newAffectationMatiere) {
      removeAllAffectationMatiere();
      for (java.util.Iterator iter = newAffectationMatiere.iterator(); iter.hasNext();)
         addAffectationMatiere((AffectationMatiere)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAffectationMatiere */
   public void addAffectationMatiere(AffectationMatiere newAffectationMatiere) {
      if (newAffectationMatiere == null)
         return;
      if (this.affectationMatiere == null)
         this.affectationMatiere = new java.util.HashSet<AffectationMatiere>();
      if (!this.affectationMatiere.contains(newAffectationMatiere))
         this.affectationMatiere.add(newAffectationMatiere);
   }
   
   /** @pdGenerated default remove
     * @param oldAffectationMatiere */
   public void removeAffectationMatiere(AffectationMatiere oldAffectationMatiere) {
      if (oldAffectationMatiere == null)
         return;
      if (this.affectationMatiere != null)
         if (this.affectationMatiere.contains(oldAffectationMatiere))
            this.affectationMatiere.remove(oldAffectationMatiere);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAffectationMatiere() {
      if (affectationMatiere != null)
         affectationMatiere.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Numerotation> getNumerotation() {
      if (numerotation == null)
         numerotation = new java.util.HashSet<Numerotation>();
      return numerotation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorNumerotation() {
      if (numerotation == null)
         numerotation = new java.util.HashSet<Numerotation>();
      return numerotation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newNumerotation */
   public void setNumerotation(java.util.Collection<Numerotation> newNumerotation) {
      removeAllNumerotation();
      for (java.util.Iterator iter = newNumerotation.iterator(); iter.hasNext();)
         addNumerotation((Numerotation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newNumerotation */
   public void addNumerotation(Numerotation newNumerotation) {
      if (newNumerotation == null)
         return;
      if (this.numerotation == null)
         this.numerotation = new java.util.HashSet<Numerotation>();
      if (!this.numerotation.contains(newNumerotation))
         this.numerotation.add(newNumerotation);
   }
   
   /** @pdGenerated default remove
     * @param oldNumerotation */
   public void removeNumerotation(Numerotation oldNumerotation) {
      if (oldNumerotation == null)
         return;
      if (this.numerotation != null)
         if (this.numerotation.contains(oldNumerotation))
            this.numerotation.remove(oldNumerotation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllNumerotation() {
      if (numerotation != null)
         numerotation.clear();
   }

}