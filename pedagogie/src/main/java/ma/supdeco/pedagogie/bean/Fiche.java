package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "fiche")
public class Fiche {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codeFiche;
	private String message;
	private Date dateFiche;
	private Boolean absenceProf;

	public Fiche() {
		super();
	}

	public Fiche(int codeFiche, String message, Date dateFiche, Boolean absenceProf) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.absenceProf = absenceProf;
	}	

	public int getCodeFiche() {
		return codeFiche;
	}

	public void setCodeFiche(int codeFiche) {
		this.codeFiche = codeFiche;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDateFiche() {
		return dateFiche;
	}

	public void setDateFiche(Date dateFiche) {
		this.dateFiche = dateFiche;
	}

	public Boolean getAbsenceProf() {
		return absenceProf;
	}

	public void setAbsenceProf(Boolean absenceProf) {
		this.absenceProf = absenceProf;
	}

}
