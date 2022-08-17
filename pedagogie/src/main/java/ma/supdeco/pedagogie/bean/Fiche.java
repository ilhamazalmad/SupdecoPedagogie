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

import java.util.Date;

@Entity
@Table(name = "fiche")
public class Fiche {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codeFiche;
	private String message;
	private Date dateFiche;
	private Date dateRattrapage;
	private Boolean seanceFaite;

	@ManyToOne
	@JoinColumn(name = "idSeance", nullable = false)
	private Seance seance;

	@OneToMany(mappedBy = "fiche", cascade = CascadeType.MERGE)
	private List<AbsenceEtudiant> absenceEtudiants;

	public Fiche() {
		super();
	}

	public Fiche(int codeFiche, String message, Date dateFiche, Date dateRattrapage, Boolean seanceFaite, Seance seance,
			List<AbsenceEtudiant> absenceEtudiants) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.dateRattrapage = dateRattrapage;
		this.seanceFaite = seanceFaite;
		this.seance = seance;
		this.absenceEtudiants = absenceEtudiants;
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

	public List<AbsenceEtudiant> getAbsenceEtudiants() {
		return absenceEtudiants;
	}

	public void setAbsenceEtudiants(List<AbsenceEtudiant> absenceEtudiants) {
		this.absenceEtudiants = absenceEtudiants;
	}

}
