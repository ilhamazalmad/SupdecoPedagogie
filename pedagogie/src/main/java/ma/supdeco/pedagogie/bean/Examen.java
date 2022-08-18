package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "examen")
public class Examen extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idExamen;
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

	public Examen() {
		super();
	}

	public Examen(int idExamen, float noteExamen, boolean absence, boolean fraude, EtudiantAnnee etudiantAnnee,
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

	public int getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(int idExamen) {
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
