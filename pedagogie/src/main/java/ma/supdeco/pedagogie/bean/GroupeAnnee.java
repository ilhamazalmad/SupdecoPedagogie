package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "groupeAnnee")
public class GroupeAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroupeAnnee;

	public java.util.Collection<EtudiantAnnee> etudiantAnnee;
	public java.util.Collection<AffectationMatiere> affectationMatiere;

	public GroupeAnnee() {
		super();
	}

	public GroupeAnnee(int idGroupeAnnee, Collection<EtudiantAnnee> etudiantAnnee,
			Collection<AffectationMatiere> affectationMatiere) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.etudiantAnnee = etudiantAnnee;
		this.affectationMatiere = affectationMatiere;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<EtudiantAnnee> getEtudiantAnnee() {
		if (etudiantAnnee == null)
			etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
		return etudiantAnnee;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorEtudiantAnnee() {
		if (etudiantAnnee == null)
			etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
		return etudiantAnnee.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newEtudiantAnnee
	 */
	public void setEtudiantAnnee(java.util.Collection<EtudiantAnnee> newEtudiantAnnee) {
		removeAllEtudiantAnnee();
		for (java.util.Iterator iter = newEtudiantAnnee.iterator(); iter.hasNext();)
			addEtudiantAnnee((EtudiantAnnee) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newEtudiantAnnee
	 */
	public void addEtudiantAnnee(EtudiantAnnee newEtudiantAnnee) {
		if (newEtudiantAnnee == null)
			return;
		if (this.etudiantAnnee == null)
			this.etudiantAnnee = new java.util.HashSet<EtudiantAnnee>();
		if (!this.etudiantAnnee.contains(newEtudiantAnnee))
			this.etudiantAnnee.add(newEtudiantAnnee);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldEtudiantAnnee
	 */
	public void removeEtudiantAnnee(EtudiantAnnee oldEtudiantAnnee) {
		if (oldEtudiantAnnee == null)
			return;
		if (this.etudiantAnnee != null)
			if (this.etudiantAnnee.contains(oldEtudiantAnnee))
				this.etudiantAnnee.remove(oldEtudiantAnnee);
	}

	/** @pdGenerated default removeAll */
	public void removeAllEtudiantAnnee() {
		if (etudiantAnnee != null)
			etudiantAnnee.clear();
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

	public int getIdGroupeAnnee() {
		return idGroupeAnnee;
	}

	public void setIdGroupeAnnee(int idGroupeAnnee) {
		this.idGroupeAnnee = idGroupeAnnee;
	}

}