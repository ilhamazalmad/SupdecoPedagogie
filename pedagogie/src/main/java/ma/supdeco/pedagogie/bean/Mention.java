package ma.supdeco.pedagogie.bean;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mention")
public class Mention {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMention;
	private String codeMention;
	private String mention;

	public java.util.Collection<Etudiant> etudiant;

	public Mention() {
		super();
	}

	public Mention(int idMention, String codeMention, String mention, Collection<Etudiant> etudiant) {
		super();
		this.idMention = idMention;
		this.codeMention = codeMention;
		this.mention = mention;
		this.etudiant = etudiant;
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

	/**
	 * @pdGenerated default setter
	 * @param newEtudiant
	 */
	public void setEtudiant(java.util.Collection<Etudiant> newEtudiant) {
		removeAllEtudiant();
		for (java.util.Iterator iter = newEtudiant.iterator(); iter.hasNext();)
			addEtudiant((Etudiant) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newEtudiant
	 */
	public void addEtudiant(Etudiant newEtudiant) {
		if (newEtudiant == null)
			return;
		if (this.etudiant == null)
			this.etudiant = new java.util.HashSet<Etudiant>();
		if (!this.etudiant.contains(newEtudiant))
			this.etudiant.add(newEtudiant);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldEtudiant
	 */
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

	public int getIdMention() {
		return idMention;
	}

	public void setIdMention(int idMention) {
		this.idMention = idMention;
	}

	public String getCodeMention() {
		return codeMention;
	}

	public void setCodeMention(String codeMention) {
		this.codeMention = codeMention;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}
}
