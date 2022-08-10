package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "absence")
public class AbsenceEtudiant implements Serializable{

	@Id
	@GeneratedValue
	private Long idAbs;
		
	@ManyToOne
	@JoinColumn(name ="ins")
	private Etudiant etudiant;
	
	@ManyToOne
	@JoinColumn(name ="codeFiche")
	private Fiche fiche;

	private boolean absent;
	
	private boolean justification;
	
	private String cause;
	
	private String cause2;
	
	private String session;
	
	public Long getIdAbs() {
		return idAbs;
	}
	public void setIdAbs(Long idAbs) {
		this.idAbs = idAbs;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Fiche getFiche() {
		return fiche;
	}
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	public boolean isAbsent() {
		return absent;
	}
	public void setAbsent(boolean absent) {
		this.absent = absent;
	}
	public boolean isJustification() {
		return justification;
	}
	public void setJustification(boolean justification) {
		this.justification = justification;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getCause2() {
		return cause2;
	}
	public void setCause2(String cause2) {
		this.cause2 = cause2;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
}
