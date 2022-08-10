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



	   public AbsenceEtudiant() {
		super();
	}
	public AbsenceEtudiant(boolean absent, boolean justifiee, String cause1, String cause2, int idEtudiant,
			int codeFiche) {
		super();
		this.absent = absent;
		this.justifiee = justifiee;
		this.cause1 = cause1;
		this.cause2 = cause2;
		this.idEtudiant = idEtudiant;
		this.codeFiche = codeFiche;
	}
	public AbsenceEtudiant(int idAbsence, boolean absent, boolean justifiee, String cause1, String cause2,
			int idEtudiant, int codeFiche) {
		super();
		this.idAbsence = idAbsence;
		this.absent = absent;
		this.justifiee = justifiee;
		this.cause1 = cause1;
		this.cause2 = cause2;
		this.idEtudiant = idEtudiant;
		this.codeFiche = codeFiche;
	}
	private int idAbsence;
	   private boolean absent;
	   private boolean justifiee;
	   private String cause1;
	   private String cause2;
	   private int idEtudiant;
	   private int codeFiche;
	public int getIdAbsence() {
		return idAbsence;
	}
	public void setIdAbsence(int idAbsence) {
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
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public int getCodeFiche() {
		return codeFiche;
	}
	public void setCodeFiche(int codeFiche) {
		this.codeFiche = codeFiche;
	}
	@Override
	public String toString() {
		return "AbsenceEtudiant [idAbsence=" + idAbsence + ", absent=" + absent + ", justifiee=" + justifiee
				+ ", cause1=" + cause1 + ", cause2=" + cause2 + ", idEtudiant=" + idEtudiant + ", codeFiche="
				+ codeFiche + "]";
	}
	
}
