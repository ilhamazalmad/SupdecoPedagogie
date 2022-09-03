package ma.supdeco.pedagogie.ws.provided.dto;

public class Numerotation extends Auditable{

private Long idNumerotation;
	private int numerotation;
private MatiereAnnee matiereAnnee;
private EtudiantAnnee etudiantAnnee;
private Salle salle;
private Session session;

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
