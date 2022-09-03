package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Session {

private Long idSession;
	private String session;
	private boolean active;
private List<Examen> examens;
private List<Rachetage> rachetages;
private List<Numerotation> numerotations;

	public Session() {
		super();
	}

	public Session(Long idSession, String session, boolean active, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations) {
		super();
		this.idSession = idSession;
		this.session = session;
		this.active = active;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
	}

	public Long getIdSession() {
		return idSession;
	}

	public void setIdSession(Long idSession) {
		this.idSession = idSession;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Examen> getExamens() {
		return examens;
	}

	public void setExamens(List<Examen> examens) {
		this.examens = examens;
	}

	public List<Rachetage> getRachetages() {
		return rachetages;
	}

	public void setRachetages(List<Rachetage> rachetages) {
		this.rachetages = rachetages;
	}

	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	public void setNumerotations(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

}
