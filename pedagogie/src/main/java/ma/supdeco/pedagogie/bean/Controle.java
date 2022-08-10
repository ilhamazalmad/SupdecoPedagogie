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
@Table(name = "controle")
public class Controle implements Serializable{

	@Id
	@GeneratedValue
	private Long idControle;
	
	@ManyToOne
	@JoinColumn(name ="ins")
	private Etudiant etudiant;
	
	private String nomNiv;
	private String codeSem;
	private String codeMat;
	private String Annee;
	private double note16;
	private double note4;
	private double noteInt;
	private double abs;
	private double noteFin;
	private Timestamp createdOn;
	private String sanction;
	
	public Controle() {
		
	}
	
	public Controle(String codeMat,double noteFin,double note16,double note4) {
		super();
        this.codeMat = codeMat;
        this.noteFin = noteFin;
        this.note16 = note16;
        this.note4 = note4;
	}
	
	public Controle(String codeMat,double noteFin,double note16,double note4, String sanction) {
		super();
        this.codeMat = codeMat;
        this.noteFin = noteFin;
        this.note16 = note16;
        this.note4 = note4;
        this.sanction = sanction;
	}
	
	public Long getIdControle() {
		return idControle;
	}
	public void setIdControle(Long idControle) {
		this.idControle = idControle;
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
	public double getNote16() {
		return note16;
	}
	public void setNote16(double note16) {
		this.note16 = note16;
	}
	public double getNote4() {
		return note4;
	}
	public void setNote4(double note4) {
		this.note4 = note4;
	}
	public double getNoteInt() {
		return noteInt;
	}
	public void setNoteInt(double noteInt) {
		this.noteInt = noteInt;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public double getAbs() {
		return abs;
	}
	public void setAbs(double abs) {
		this.abs = abs;
	}
	public double getNoteFin() {
		return noteFin;
	}
	public void setNoteFin(double noteFin) {
		this.noteFin = noteFin;
	}

	public String getSanction() {
		return sanction;
	}

	public void setSanction(String sanction) {
		this.sanction = sanction;
	}

}
