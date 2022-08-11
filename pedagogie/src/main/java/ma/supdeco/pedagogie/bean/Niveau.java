package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "niveau")
public class Niveau implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNiveau;
	private String niveau;

	public SemestreNiveau[] semestreNiveau;
	public java.util.Collection<EtudiantAnnee> etudiantAnnee;
	public java.util.Collection<SousGroupeAnnee> sousGroupeAnnee;
	public java.util.Collection<GroupeAnnee> groupeAnnee;

	public Niveau() {
		super();
	}

	public Niveau(int idNiveau, String niveau, SemestreNiveau[] semestreNiveau, Collection<EtudiantAnnee> etudiantAnnee,
			Collection<SousGroupeAnnee> sousGroupeAnnee, Collection<GroupeAnnee> groupeAnnee) {
		super();
		this.idNiveau = idNiveau;
		this.niveau = niveau;
		this.semestreNiveau = semestreNiveau;
		this.etudiantAnnee = etudiantAnnee;
		this.sousGroupeAnnee = sousGroupeAnnee;
		this.groupeAnnee = groupeAnnee;
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
	public java.util.Collection<SousGroupeAnnee> getSousGroupeAnnee() {
		if (sousGroupeAnnee == null)
			sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
		return sousGroupeAnnee;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorSousGroupeAnnee() {
		if (sousGroupeAnnee == null)
			sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
		return sousGroupeAnnee.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newSousGroupeAnnee
	 */
	public void setSousGroupeAnnee(java.util.Collection<SousGroupeAnnee> newSousGroupeAnnee) {
		removeAllSousGroupeAnnee();
		for (java.util.Iterator iter = newSousGroupeAnnee.iterator(); iter.hasNext();)
			addSousGroupeAnnee((SousGroupeAnnee) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newSousGroupeAnnee
	 */
	public void addSousGroupeAnnee(SousGroupeAnnee newSousGroupeAnnee) {
		if (newSousGroupeAnnee == null)
			return;
		if (this.sousGroupeAnnee == null)
			this.sousGroupeAnnee = new java.util.HashSet<SousGroupeAnnee>();
		if (!this.sousGroupeAnnee.contains(newSousGroupeAnnee))
			this.sousGroupeAnnee.add(newSousGroupeAnnee);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldSousGroupeAnnee
	 */
	public void removeSousGroupeAnnee(SousGroupeAnnee oldSousGroupeAnnee) {
		if (oldSousGroupeAnnee == null)
			return;
		if (this.sousGroupeAnnee != null)
			if (this.sousGroupeAnnee.contains(oldSousGroupeAnnee))
				this.sousGroupeAnnee.remove(oldSousGroupeAnnee);
	}

	/** @pdGenerated default removeAll */
	public void removeAllSousGroupeAnnee() {
		if (sousGroupeAnnee != null)
			sousGroupeAnnee.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<GroupeAnnee> getGroupeAnnee() {
		if (groupeAnnee == null)
			groupeAnnee = new java.util.HashSet<GroupeAnnee>();
		return groupeAnnee;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorGroupeAnnee() {
		if (groupeAnnee == null)
			groupeAnnee = new java.util.HashSet<GroupeAnnee>();
		return groupeAnnee.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newGroupeAnnee
	 */
	public void setGroupeAnnee(java.util.Collection<GroupeAnnee> newGroupeAnnee) {
		removeAllGroupeAnnee();
		for (java.util.Iterator iter = newGroupeAnnee.iterator(); iter.hasNext();)
			addGroupeAnnee((GroupeAnnee) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newGroupeAnnee
	 */
	public void addGroupeAnnee(GroupeAnnee newGroupeAnnee) {
		if (newGroupeAnnee == null)
			return;
		if (this.groupeAnnee == null)
			this.groupeAnnee = new java.util.HashSet<GroupeAnnee>();
		if (!this.groupeAnnee.contains(newGroupeAnnee))
			this.groupeAnnee.add(newGroupeAnnee);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldGroupeAnnee
	 */
	public void removeGroupeAnnee(GroupeAnnee oldGroupeAnnee) {
		if (oldGroupeAnnee == null)
			return;
		if (this.groupeAnnee != null)
			if (this.groupeAnnee.contains(oldGroupeAnnee))
				this.groupeAnnee.remove(oldGroupeAnnee);
	}

	/** @pdGenerated default removeAll */
	public void removeAllGroupeAnnee() {
		if (groupeAnnee != null)
			groupeAnnee.clear();
	}

	public int getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public SemestreNiveau[] getSemestreNiveau() {
		return semestreNiveau;
	}

	public void setSemestreNiveau(SemestreNiveau[] semestreNiveau) {
		this.semestreNiveau = semestreNiveau;
	}
}
