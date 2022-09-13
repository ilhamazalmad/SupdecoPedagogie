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
@Table(name = "examen")
@SQLDelete(sql = "UPDATE examen SET deleted = true WHERE idExamen=?")
@Where(clause = "deleted=false")
public class Examen extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExamen;
	private float noteExamen;
	private boolean absence;
	private boolean fraude;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private EtudiantAnnee etudiantAnnee;

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private MatiereAnnee matiereAnnee;

	@ManyToOne
	@JoinColumn(name = "idSession", nullable = false)
	private Session session;

	private boolean deleted = Boolean.FALSE;

	public Examen() {
		super();
	}

	public Examen(Long idExamen, float noteExamen, boolean absence, boolean fraude, EtudiantAnnee etudiantAnnee,
			MatiereAnnee matiereAnnee, Session session) {
		super();
		this.idExamen = idExamen;
		this.noteExamen = noteExamen;
		this.absence = absence;
		this.fraude = fraude;
		this.etudiantAnnee = etudiantAnnee;
		this.matiereAnnee = matiereAnnee;
		this.session = session;
	}

	public Examen(Long idExamen, float noteExamen, boolean absence, boolean fraude, EtudiantAnnee etudiantAnnee,
			MatiereAnnee matiereAnnee, Session session, boolean deleted) {
		super();
		this.idExamen = idExamen;
		this.noteExamen = noteExamen;
		this.absence = absence;
		this.fraude = fraude;
		this.etudiantAnnee = etudiantAnnee;
		this.matiereAnnee = matiereAnnee;
		this.session = session;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}

	public float getNoteExamen() {
		return noteExamen;
	}

	public void setNoteExamen(float noteExamen) {
		this.noteExamen = noteExamen;
	}

	public boolean isAbsence() {
		return absence;
	}

	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	public boolean isFraude() {
		return fraude;
	}

	public void setFraude(boolean fraude) {
		this.fraude = fraude;
	}

	public EtudiantAnnee getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}

	public MatiereAnnee getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(MatiereAnnee matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
