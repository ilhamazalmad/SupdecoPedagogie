package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "numerotation")
@SQLDelete(sql = "UPDATE numerotation SET deleted = true WHERE idNumerotation=?")
@Where(clause = "deleted=false")
public class Numerotation extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idNumerotation;
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

	private boolean deleted = Boolean.FALSE;

	public Numerotation() {
		super();
	}

	public Numerotation(Long idNumerotation, int numerotation, MatiereAnnee matiereAnnee, EtudiantAnnee etudiantAnnee,
			Salle salle, Session session) {
		super();
		this.idNumerotation = idNumerotation;
		this.numerotation = numerotation;
		this.matiereAnnee = matiereAnnee;
		this.etudiantAnnee = etudiantAnnee;
		this.salle = salle;
		this.session = session;
	}

	public Numerotation(Long idNumerotation, int numerotation, MatiereAnnee matiereAnnee, EtudiantAnnee etudiantAnnee,
			Salle salle, Session session, boolean deleted) {
		super();
		this.idNumerotation = idNumerotation;
		this.numerotation = numerotation;
		this.matiereAnnee = matiereAnnee;
		this.etudiantAnnee = etudiantAnnee;
		this.salle = salle;
		this.session = session;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdNumerotation() {
		return idNumerotation;
	}

	public void setIdNumerotation(Long idNumerotation) {
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
