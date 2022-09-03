package ma.supdeco.pedagogie.ws.provided.dto;

public class Absence {

	private Long idAbsence;
	private boolean absent;
	private boolean justifiee;
	private String cause1;
	private String cause2;
	private EtudiantAnnee etudiantAnnee;
	private Fiche fiche;

	public Absence() {
		super();
	}

	public Absence(Long idAbsence, boolean absent, boolean justifiee, String cause1, String cause2,
			EtudiantAnnee etudiantAnnee, Fiche fiche) {
		super();
		this.idAbsence = idAbsence;
		this.absent = absent;
		this.justifiee = justifiee;
		this.cause1 = cause1;
		this.cause2 = cause2;
		this.etudiantAnnee = etudiantAnnee;
		this.fiche = fiche;
	}

	public Long getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(Long idAbsence) {
		this.idAbsence = idAbsence;
	}

	public boolean isAbsent() {
		return absent;
	}

	public void setAbsent(boolean absent) {
		this.absent = absent;
	}

	public boolean isJustifiee() {
		return justifiee;
	}

	public void setJustifiee(boolean justifiee) {
		this.justifiee = justifiee;
	}

	public String getCause1() {
		return cause1;
	}

	public void setCause1(String cause1) {
		this.cause1 = cause1;
	}

	public String getCause2() {
		return cause2;
	}

	public void setCause2(String cause2) {
		this.cause2 = cause2;
	}

	public EtudiantAnnee getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}

}
