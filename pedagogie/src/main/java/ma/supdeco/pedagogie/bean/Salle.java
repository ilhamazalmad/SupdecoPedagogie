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
@Table(name = "salle")

public class Salle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codeSalle;
	private String nom;
	private int type;
	private int nbrTables;

	public java.util.Collection<Seance> seance;
	public java.util.Collection<Numerotation> numerotation;

	public Salle() {
		super();
	}

	public Salle(int codeSalle, String nom, int type, int nbrTables, Collection<Seance> seance,
			Collection<Numerotation> numerotation) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.type = type;
		this.nbrTables = nbrTables;
		this.seance = seance;
		this.numerotation = numerotation;
	}

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

	/**
	 * @pdGenerated default setter
	 * @param newSeance
	 */
	public void setSeance(java.util.Collection<Seance> newSeance) {
		removeAllSeance();
		for (java.util.Iterator iter = newSeance.iterator(); iter.hasNext();)
			addSeance((Seance) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newSeance
	 */
	public void addSeance(Seance newSeance) {
		if (newSeance == null)
			return;
		if (this.seance == null)
			this.seance = new java.util.HashSet<Seance>();
		if (!this.seance.contains(newSeance))
			this.seance.add(newSeance);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldSeance
	 */
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

	/**
	 * @pdGenerated default setter
	 * @param newNumerotation
	 */
	public void setNumerotation(java.util.Collection<Numerotation> newNumerotation) {
		removeAllNumerotation();
		for (java.util.Iterator iter = newNumerotation.iterator(); iter.hasNext();)
			addNumerotation((Numerotation) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newNumerotation
	 */
	public void addNumerotation(Numerotation newNumerotation) {
		if (newNumerotation == null)
			return;
		if (this.numerotation == null)
			this.numerotation = new java.util.HashSet<Numerotation>();
		if (!this.numerotation.contains(newNumerotation))
			this.numerotation.add(newNumerotation);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldNumerotation
	 */
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

	public int getCodeSalle() {
		return codeSalle;
	}

	public void setCodeSalle(int codeSalle) {
		this.codeSalle = codeSalle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNbrTables() {
		return nbrTables;
	}

	public void setNbrTables(int nbrTables) {
		this.nbrTables = nbrTables;
	}
}
