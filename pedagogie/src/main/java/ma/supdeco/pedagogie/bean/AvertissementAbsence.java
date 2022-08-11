package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avertissementAbsence")
public class AvertissementAbsence implements Serializable {
	public AvertissementAbsence() {
		super();
	}
	public AvertissementAbsence(int idAvertissement, int absAvertissement, int absConseil, int absEngage,
			boolean avertis, boolean conseil, boolean presentConseil, boolean engage, boolean fin,
			Date dateAvertissement, Date dateConseil, Date dateEngagement, int idEtudiant, int idSemestre) {
		super();
		this.idAvertissement = idAvertissement;
		this.absAvertissement = absAvertissement;
		this.absConseil = absConseil;
		this.absEngage = absEngage;
		this.avertis = avertis;
		this.conseil = conseil;
		this.presentConseil = presentConseil;
		this.engage = engage;
		this.fin = fin;
		this.dateAvertissement = dateAvertissement;
		this.dateConseil = dateConseil;
		this.dateEngagement = dateEngagement;
		this.idEtudiant = idEtudiant;
		this.idSemestre = idSemestre;
	}
	private int idAvertissement;
	   private int absAvertissement;
	   private int absConseil;
	   private int absEngage;
	   private boolean avertis;
	   private boolean conseil;
	   private boolean presentConseil;
	   private boolean engage;
	   private boolean fin;
	   private Date dateAvertissement;
	   private Date dateConseil;
	   private Date dateEngagement;
	   private int idEtudiant;
	   private int idSemestre;
	public int getIdAvertissement() {
		return idAvertissement;
	}
	public void setIdAvertissement(int idAvertissement) {
		this.idAvertissement = idAvertissement;
	}
	public int getAbsAvertissement() {
		return absAvertissement;
	}
	public void setAbsAvertissement(int absAvertissement) {
		this.absAvertissement = absAvertissement;
	}
	public int getAbsConseil() {
		return absConseil;
	}
	public void setAbsConseil(int absConseil) {
		this.absConseil = absConseil;
	}
	public int getAbsEngage() {
		return absEngage;
	}
	public void setAbsEngage(int absEngage) {
		this.absEngage = absEngage;
	}
	public boolean isAvertis() {
		return avertis;
	}
	public void setAvertis(boolean avertis) {
		this.avertis = avertis;
	}
	public boolean isConseil() {
		return conseil;
	}
	public void setConseil(boolean conseil) {
		this.conseil = conseil;
	}
	public boolean isPresentConseil() {
		return presentConseil;
	}
	public void setPresentConseil(boolean presentConseil) {
		this.presentConseil = presentConseil;
	}
	public boolean isEngage() {
		return engage;
	}
	public void setEngage(boolean engage) {
		this.engage = engage;
	}
	public boolean isFin() {
		return fin;
	}
	public void setFin(boolean fin) {
		this.fin = fin;
	}
	public Date getDateAvertissement() {
		return dateAvertissement;
	}
	public void setDateAvertissement(Date dateAvertissement) {
		this.dateAvertissement = dateAvertissement;
	}
	public Date getDateConseil() {
		return dateConseil;
	}
	public void setDateConseil(Date dateConseil) {
		this.dateConseil = dateConseil;
	}
	public Date getDateEngagement() {
		return dateEngagement;
	}
	public void setDateEngagement(Date dateEngagement) {
		this.dateEngagement = dateEngagement;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public int getIdSemestre() {
		return idSemestre;
	}
	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}
	
}
