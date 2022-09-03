package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;
import java.util.Date;

public class Fiche extends Auditable{

private Long codeFiche;
	private String message;
	private Date dateFiche;
	private Date dateRattrapage;
	private Boolean seanceFaite;
private Seance seance;
private List<Absence> absences;

	public Fiche() {
		super();
	}

	public Fiche(Long codeFiche, String message, Date dateFiche, Date dateRattrapage, Boolean seanceFaite, Seance seance,
			List<Absence> absences) {
		super();
		this.codeFiche = codeFiche;
		this.message = message;
		this.dateFiche = dateFiche;
		this.dateRattrapage = dateRattrapage;
		this.seanceFaite = seanceFaite;
		this.seance = seance;
		this.absences = absences;
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
