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
@Table(name = "rachetage")
public class Rachetage extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRachetage;
	private boolean rachetage;

	@ManyToOne
	@JoinColumn(name = "idSession", nullable = false)
	private Session session;

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private MatiereAnnee matiereAnnee;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
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
