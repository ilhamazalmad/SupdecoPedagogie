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
@Table(name = "heureSeance")
public class HeureSeance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idHeure;
	private String heure;

	@OneToMany(mappedBy = "heureDebut", cascade = CascadeType.MERGE)
	private List<Seance> seancesDebuts;

	@OneToMany(mappedBy = "heureFin", cascade = CascadeType.MERGE)
	private List<Seance> seancesFins;

	public HeureSeance() {
		super();
	}

	public HeureSeance(Long idHeure, String heure, List<Seance> seancesDebuts, List<Seance> seancesFins) {
		super();
		this.idHeure = idHeure;
		this.heure = heure;
		this.seancesDebuts = seancesDebuts;
		this.seancesFins = seancesFins;
	}

	public Long getIdHeure() {
		return idHeure;
	}

	public void setIdHeure(Long idHeure) {
		this.idHeure = idHeure;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public List<Seance> getSeancesDebuts() {
		return seancesDebuts;
	}

	public void setSeancesDebuts(List<Seance> seancesDebuts) {
		this.seancesDebuts = seancesDebuts;
	}

	public List<Seance> getSeancesFins() {
		return seancesFins;
	}

	public void setSeancesFins(List<Seance> seancesFins) {
		this.seancesFins = seancesFins;
	}

}
