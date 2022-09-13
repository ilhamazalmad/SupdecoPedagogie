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
@Table(name = "heureSeance")
@SQLDelete(sql = "UPDATE heureSeance SET deleted = true WHERE idHeure=?")
@Where(clause = "deleted=false")
public class HeureSeance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idHeure;
	private String heure;

	@OneToMany(mappedBy = "heureDebut", cascade = CascadeType.MERGE)
	private List<Seance> seancesDebuts;

	@OneToMany(mappedBy = "heureFin", cascade = CascadeType.MERGE)
	private List<Seance> seancesFins;

	private boolean deleted = Boolean.FALSE;

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

	public HeureSeance(Long idHeure, String heure, List<Seance> seancesDebuts, List<Seance> seancesFins,
			boolean deleted) {
		super();
		this.idHeure = idHeure;
		this.heure = heure;
		this.seancesDebuts = seancesDebuts;
		this.seancesFins = seancesFins;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
