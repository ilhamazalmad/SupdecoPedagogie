package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "session")
public class Session implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSession;
	private String session;
	private boolean active;

	public java.util.Collection<Examen> examen;
	public java.util.Collection<Rachetage> rachetage;
	public java.util.Collection<Numerotation> numerotation;

	public Session() {
		super();
	}

	public Session(int idSession, String session, boolean active, Collection<Examen> examen,
			Collection<Rachetage> rachetage, Collection<Numerotation> numerotation) {
		super();
		this.idSession = idSession;
		this.session = session;
		this.active = active;
		this.examen = examen;
		this.rachetage = rachetage;
		this.numerotation = numerotation;
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

	/**
	 * @pdGenerated default setter
	 * @param newExamen
	 */
	public void setExamen(java.util.Collection<Examen> newExamen) {
		removeAllExamen();
		for (java.util.Iterator iter = newExamen.iterator(); iter.hasNext();)
			addExamen((Examen) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newExamen
	 */
	public void addExamen(Examen newExamen) {
		if (newExamen == null)
			return;
		if (this.examen == null)
			this.examen = new java.util.HashSet<Examen>();
		if (!this.examen.contains(newExamen))
			this.examen.add(newExamen);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldExamen
	 */
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

	/**
	 * @pdGenerated default setter
	 * @param newRachetage
	 */
	public void setRachetage(java.util.Collection<Rachetage> newRachetage) {
		removeAllRachetage();
		for (java.util.Iterator iter = newRachetage.iterator(); iter.hasNext();)
			addRachetage((Rachetage) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newRachetage
	 */
	public void addRachetage(Rachetage newRachetage) {
		if (newRachetage == null)
			return;
		if (this.rachetage == null)
			this.rachetage = new java.util.HashSet<Rachetage>();
		if (!this.rachetage.contains(newRachetage))
			this.rachetage.add(newRachetage);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldRachetage
	 */
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

	public int getIdSession() {
		return idSession;
	}

	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
