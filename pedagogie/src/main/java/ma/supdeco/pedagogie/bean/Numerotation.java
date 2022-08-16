package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "numerotation")
public class Numerotation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNumerotation;
	private int numerotation;

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private MatiereAnnee matiereAnnee;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private EtudiantAnnee etudiantAnnee;

	@ManyToOne
	@JoinColumn(name = "idSalle", nullable = false)
	private Salle salle;

	@ManyToOne
	@JoinColumn(name = "idSession", nullable = false)
	private Session session;

	public Numerotation() {
		super();
	}

	public Numerotation(int idNumerotation, int numerotation, MatiereAnnee matiereAnnee, EtudiantAnnee etudiantAnnee,
			Salle salle, Session session) {
		super();
		this.idNumerotation = idNumerotation;
		this.numerotation = numerotation;
		this.matiereAnnee = matiereAnnee;
		this.etudiantAnnee = etudiantAnnee;
		this.salle = salle;
		this.session = session;
	}

	public int getIdNumerotation() {
		return idNumerotation;
	}

	public void setIdNumerotation(int idNumerotation) {
		this.idNumerotation = idNumerotation;
	}

	public int getNumerotation() {
		return numerotation;
	}

	public void setNumerotation(int numerotation) {
		this.numerotation = numerotation;
	}

	public MatiereAnnee getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(MatiereAnnee matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

	public EtudiantAnnee getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
