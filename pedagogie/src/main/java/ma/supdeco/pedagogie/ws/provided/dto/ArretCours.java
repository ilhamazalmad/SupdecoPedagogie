package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.Date;
import java.util.List;

public class ArretCours extends Auditable{

private Long idArret;
	private Date dateDebut;
	private Date dateFin;
	private boolean active;
private MotifArret motifArret;
private EtudiantAnnee etudiantAnnee;
private Utilisateur utilisateur;

	public ArretCours() {
		super();
	}

	public ArretCours(Long idArret, Date dateDebut, Date dateFin, boolean active, MotifArret motifArret,
			EtudiantAnnee etudiantAnnee, Utilisateur utilisateur) {
		super();
		this.idArret = idArret;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.active = active;
		this.motifArret = motifArret;
		this.etudiantAnnee = etudiantAnnee;
		this.utilisateur = utilisateur;
	}

	public Long getIdArret() {
		return idArret;
	}

	public void setIdArret(Long idArret) {
		this.idArret = idArret;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public MotifArret getMotifArret() {
		return motifArret;
	}

	public void setMotifArret(MotifArret motifArret) {
		this.motifArret = motifArret;
	}

	public EtudiantAnnee getEtudiantAnnee() {
		return etudiantAnnee;
	}

	public void setEtudiantAnnee(EtudiantAnnee etudiantAnnee) {
		this.etudiantAnnee = etudiantAnnee;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
