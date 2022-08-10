package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arret")
public class ArretCours implements Serializable{

	@Id
	@GeneratedValue
	private Long idArret;
	
	@ManyToOne
	@JoinColumn(name ="ins")
	private Etudiant etudiant;
	
	private String dateDebut;
	private String dateFin;
	private String motif;
	private String respArret;
	private boolean active;
	
	public Long getIdArret() {
		return idArret;
	}
	public void setIdArret(Long idArret) {
		this.idArret = idArret;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public String getRespArret() {
		return respArret;
	}
	public void setRespArret(String respArret) {
		this.respArret = respArret;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
}
