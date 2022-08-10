package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen implements Serializable{

	@Id
	@GeneratedValue
	private Long idExamen;
	
	@ManyToOne
	@JoinColumn(name ="ins")
	private Etudiant etudiant;
	
	private String nomNiv;
	private String codeSem;
	private String codeMat;
	private String Annee;
	private String session;
	private double noteEx;
	private Timestamp createdOn;
	private String sanction;
	
	public Long getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public String getNomNiv() {
		return nomNiv;
	}
	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}
	public String getCodeSem() {
		return codeSem;
	}
	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;
	}
	public String getCodeMat() {
		return codeMat;
	}
	public void setCodeMat(String codeMat) {
		this.codeMat = codeMat;
	}
	public String getAnnee() {
		return Annee;
	}
	public void setAnnee(String annee) {
		Annee = annee;
	}
	public double getNoteEx() {
		return noteEx;
	}
	public void setNoteEx(double noteEx) {
		this.noteEx = noteEx;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public String getSanction() {
		return sanction;
	}
	public void setSanction(String sanction) {
		this.sanction = sanction;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
}
