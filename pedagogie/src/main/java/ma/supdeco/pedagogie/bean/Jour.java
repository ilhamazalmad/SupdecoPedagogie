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
@Table(name = "jour")
public class Jour {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idJour;
	private String jour;

	@OneToMany(mappedBy = "jour", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	public Jour() {
		super();
	}

	public Jour(Long idJour, String jour, List<Seance> seances) {
		super();
		this.idJour = idJour;
		this.jour = jour;
		this.seances = seances;
	}

	public Long getIdJour() {
		return idJour;
	}

	public void setIdJour(Long idJour) {
		this.idJour = idJour;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

}
