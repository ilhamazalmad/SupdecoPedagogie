package ma.supdeco.pedagogie.ws.provided.dto;

public class Rachetage extends Auditable{

private Long idRachetage;
	private boolean rachetage;
private Session session;
private MatiereAnnee matiereAnnee;

private EtudiantAnnee etudiantAnnee;

	public Rachetage() {
		super();
	}

	public Rachetage(Long idRachetage, boolean rachetage, Session session, MatiereAnnee matiereAnnee,
			EtudiantAnnee etudiantAnnee) {
		super();
		this.idRachetage = idRachetage;
		this.rachetage = rachetage;
		this.session = session;
		this.matiereAnnee = matiereAnnee;
		this.etudiantAnnee = etudiantAnnee;
	}

	public Long getIdRachetage() {
		return idRachetage;
	}

	public void setIdRachetage(Long idRachetage) {
		this.idRachetage = idRachetage;
	}

	public boolean isRachetage() {
		return rachetage;
	}

	public void setRachetage(boolean rachetage) {
		this.rachetage = rachetage;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
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

}
