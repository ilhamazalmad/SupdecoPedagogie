package ma.supdeco.pedagogie.ws.provided.dto;

public class Examen extends Auditable{

private Long idExamen;
	private float noteExamen;
	private boolean absence;
	private boolean fraude;
private EtudiantAnnee etudiantAnnee;
private MatiereAnnee matiereAnnee;
private Session session;

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
