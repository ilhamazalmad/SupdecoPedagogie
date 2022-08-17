package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "session")
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSession;
	private String session;
	private boolean active;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Examen> examens;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Rachetage> rachetages;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Numerotation> numerotations;

	public Session() {
		super();
	}

	public Session(int idSession, String session, boolean active, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations) {
		super();
		this.idSession = idSession;
		this.session = session;
		this.active = active;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
	}

	public int getIdSession() {
		return idSession;
	}

	public void setIdSession(int idSession) {
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
