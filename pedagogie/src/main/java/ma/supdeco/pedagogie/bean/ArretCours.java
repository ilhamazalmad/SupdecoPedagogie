package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arretCours")
public class ArretCours implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idArret;
	private Date dateDebut;
	private Date dateFin;
	private int motif;
	private boolean active;
	private int idEtudiant;
	private int responsable;

	public ArretCours() {
		super();
	}

	public ArretCours(int idArret, Date dateDebut, Date dateFin, int motif, boolean active, int idEtudiant,
			int responsable) {
		super();
		this.idArret = idArret;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.motif = motif;
		this.active = active;
		this.idEtudiant = idEtudiant;
		this.responsable = responsable;
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

	public int getMotif() {
		return motif;
	}

	public void setMotif(int motif) {
		this.motif = motif;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public int getResponsable() {
		return responsable;
	}

	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}
}
