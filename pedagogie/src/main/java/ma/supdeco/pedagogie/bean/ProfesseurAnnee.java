package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professeurAnnee")
public class ProfesseurAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProfesseurAnnee;

	public java.util.Collection<AffectationMatiere> affectationMatiere;

	public ProfesseurAnnee() {
		super();
	}

	public ProfesseurAnnee(int idProfesseurAnnee, Collection<AffectationMatiere> affectationMatiere) {
		super();
		this.idProfesseurAnnee = idProfesseurAnnee;
		this.affectationMatiere = affectationMatiere;
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

	/**
	 * @pdGenerated default setter
	 * @param newAffectationMatiere
	 */
	public void setAffectationMatiere(java.util.Collection<AffectationMatiere> newAffectationMatiere) {
		removeAllAffectationMatiere();
		for (java.util.Iterator iter = newAffectationMatiere.iterator(); iter.hasNext();)
			addAffectationMatiere((AffectationMatiere) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newAffectationMatiere
	 */
	public void addAffectationMatiere(AffectationMatiere newAffectationMatiere) {
		if (newAffectationMatiere == null)
			return;
		if (this.affectationMatiere == null)
			this.affectationMatiere = new java.util.HashSet<AffectationMatiere>();
		if (!this.affectationMatiere.contains(newAffectationMatiere))
			this.affectationMatiere.add(newAffectationMatiere);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldAffectationMatiere
	 */
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

	public int getIdProfesseurAnnee() {
		return idProfesseurAnnee;
	}

	public void setIdProfesseurAnnee(int idProfesseurAnnee) {
		this.idProfesseurAnnee = idProfesseurAnnee;
	}

}