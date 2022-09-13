package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "session")
@SQLDelete(sql = "UPDATE session SET deleted = true WHERE idSession=?")
@Where(clause = "deleted=false")
public class Session {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSession;
	private String session;
	private boolean active;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Examen> examens;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Rachetage> rachetages;

	@OneToMany(mappedBy = "session", cascade = CascadeType.MERGE)
	private List<Numerotation> numerotations;

	private boolean deleted = Boolean.FALSE;

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

	public Session(Long idSession, String session, boolean active, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations, boolean deleted) {
		super();
		this.idSession = idSession;
		this.session = session;
		this.active = active;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
