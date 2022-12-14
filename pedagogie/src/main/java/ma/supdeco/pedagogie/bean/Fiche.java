package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import ma.supdeco.pedagogie.bean.util.Auditable;

import java.util.Date;

@Entity
@Table(name = "fiche")
@SQLDelete(sql = "UPDATE fiche SET deleted = true WHERE codeFiche=?")
@Where(clause = "deleted=false")
public class Fiche extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeFiche;
	private String message;
	private Date dateFiche;
	private Date dateRattrapage;
	private Boolean seanceFaite;

	@ManyToOne
	@JoinColumn(name = "idSeance", nullable = false)
	private Seance seance;

	@OneToMany(mappedBy = "fiche", cascade = CascadeType.MERGE)
	private List<Absence> absences;

	private boolean deleted = Boolean.FALSE;

	public Fiche() {
		super();
	}

	public Fiche(Long codeFiche, String message, Date dateFiche, Date dateRattrapage, Boolean seanceFaite,
			Seance seance, List<Absence> absences) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.dateRattrapage = dateRattrapage;
		this.seanceFaite = seanceFaite;
		this.seance = seance;
		this.absences = absences;
	}

	public Fiche(Long codeFiche, String message, Date dateFiche, Date dateRattrapage, Boolean seanceFaite,
			Seance seance, List<Absence> absences, boolean deleted) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.dateRattrapage = dateRattrapage;
		this.seanceFaite = seanceFaite;
		this.seance = seance;
		this.absences = absences;
		this.deleted = deleted;
	}

	public List<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getCodeFiche() {
		return codeFiche;
	}

	public void setCodeFiche(Long codeFiche) {
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

	public Date getDateRattrapage() {
		return dateRattrapage;
	}

	public void setDateRattrapage(Date dateRattrapage) {
		this.dateRattrapage = dateRattrapage;
	}

	public Boolean getSeanceFaite() {
		return seanceFaite;
	}

	public void setSeanceFaite(Boolean seanceFaite) {
		this.seanceFaite = seanceFaite;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public List<Absence> getAbsenceEtudiants() {
		return absences;
	}

	public void setAbsenceEtudiants(List<Absence> absences) {
		this.absences = absences;
	}

}
