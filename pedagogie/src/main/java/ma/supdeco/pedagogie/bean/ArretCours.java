package ma.supdeco.pedagogie.bean;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "arretCours")
public class ArretCours extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArret;
	private Date dateDebut;
	private Date dateFin;
	private boolean active;

	@ManyToOne
	@JoinColumn(name = "idMotif", nullable = false)
	private MotifArret motifArret;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private EtudiantAnnee etudiantAnnee;

	@ManyToOne
	@JoinColumn(name = "idUtilisateur", nullable = false)
	private Utilisateur utilisateur;

	public ArretCours() {
		super();
	}

	public ArretCours(int idArret, Date dateDebut, Date dateFin, boolean active, MotifArret motifArret,
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

	public int getIdArret() {
		return idArret;
	}

	public void setIdArret(int idArret) {
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
