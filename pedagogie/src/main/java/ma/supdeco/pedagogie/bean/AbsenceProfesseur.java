package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "absenceProfesseur")
public class AbsenceProfesseur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAbsence;
	private boolean absent;
	private int idProfesseur;
	private int codeFiche;

	public AbsenceProfesseur(boolean absent, int idProfesseur, int codeFiche) {
		super();
		this.absent = absent;
		this.idProfesseur = idProfesseur;
		this.codeFiche = codeFiche;
	}

	public AbsenceProfesseur() {
		super();
	}

	public AbsenceProfesseur(int idAbsence, boolean absent, int idProfesseur, int codeFiche) {
		super();
		this.idAbsence = idAbsence;
		this.absent = absent;
		this.idProfesseur = idProfesseur;
		this.codeFiche = codeFiche;
	}

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

	public int getIdProfesseur() {
		return idProfesseur;
	}

	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
	}

	public int getCodeFiche() {
		return codeFiche;
	}

	public void setCodeFiche(int codeFiche) {
		this.codeFiche = codeFiche;
	}

}
