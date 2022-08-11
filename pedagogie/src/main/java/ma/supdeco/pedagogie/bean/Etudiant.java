package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")

public class Etudiant {

	public Etudiant(int ins, String nom, String prenom, String cin, String cne, String photo, String sexe,
			String telephone, String adresse, String email, String emailSupdeco, Date dateNaissance,
			int lieuDeNaissance, Date dateInscription, String situation, int anneeBac, String lyceeBac,
			String typeLycee, String specialiteDiplome, int anneeDiplome, String etablissementDiplome,
			String typeEtablissement, boolean boursier, boolean resident, boolean handicape, boolean fonctionnaire,
			String posteOccupe, EtudiantAnnee[] etudiantAnnee, Collection<Tuteur> tuteur) {
		super();
		this.ins = ins;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.cne = cne;
		this.photo = photo;
		this.sexe = sexe;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
		this.emailSupdeco = emailSupdeco;
		this.dateNaissance = dateNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.dateInscription = dateInscription;
		this.situation = situation;
		this.anneeBac = anneeBac;
		this.lyceeBac = lyceeBac;
		this.typeLycee = typeLycee;
		this.specialiteDiplome = specialiteDiplome;
		this.anneeDiplome = anneeDiplome;
		this.etablissementDiplome = etablissementDiplome;
		this.typeEtablissement = typeEtablissement;
		this.boursier = boursier;
		this.resident = resident;
		this.handicape = handicape;
		this.fonctionnaire = fonctionnaire;
		this.posteOccupe = posteOccupe;
		this.etudiantAnnee = etudiantAnnee;
		this.tuteur = tuteur;
	}

	public Etudiant() {
		super();
	}

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

	public int getIns() {
		return ins;
	}

	public void setIns(int ins) {
		this.ins = ins;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSupdeco() {
		return emailSupdeco;
	}

	public void setEmailSupdeco(String emailSupdeco) {
		this.emailSupdeco = emailSupdeco;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	public void setLieuDeNaissance(int lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int getAnneeBac() {
		return anneeBac;
	}

	public void setAnneeBac(int anneeBac) {
		this.anneeBac = anneeBac;
	}

	public String getLyceeBac() {
		return lyceeBac;
	}

	public void setLyceeBac(String lyceeBac) {
		this.lyceeBac = lyceeBac;
	}

	public String getTypeLycee() {
		return typeLycee;
	}

	public void setTypeLycee(String typeLycee) {
		this.typeLycee = typeLycee;
	}

	public String getSpecialiteDiplome() {
		return specialiteDiplome;
	}

	public void setSpecialiteDiplome(String specialiteDiplome) {
		this.specialiteDiplome = specialiteDiplome;
	}

	public int getAnneeDiplome() {
		return anneeDiplome;
	}

	public void setAnneeDiplome(int anneeDiplome) {
		this.anneeDiplome = anneeDiplome;
	}

	public String getEtablissementDiplome() {
		return etablissementDiplome;
	}

	public void setEtablissementDiplome(String etablissementDiplome) {
		this.etablissementDiplome = etablissementDiplome;
	}

	public String getTypeEtablissement() {
		return typeEtablissement;
	}

	public void setTypeEtablissement(String typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

	public boolean isBoursier() {
		return boursier;
	}

	public void setBoursier(boolean boursier) {
		this.boursier = boursier;
	}

	public boolean isResident() {
		return resident;
	}

	public void setResident(boolean resident) {
		this.resident = resident;
	}

	public boolean isHandicape() {
		return handicape;
	}

	public void setHandicape(boolean handicape) {
		this.handicape = handicape;
	}

	public boolean isFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(boolean fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}

	public String getPosteOccupe() {
		return posteOccupe;
	}

	public void setPosteOccupe(String posteOccupe) {
		this.posteOccupe = posteOccupe;
	}

	public EtudiantAnnee[] getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee[] etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}
}
