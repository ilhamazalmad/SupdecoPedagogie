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
@Table(name = "jour")
@SQLDelete(sql = "UPDATE jour SET deleted = true WHERE idJour=?")
@Where(clause = "deleted=false")
public class Jour {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idJour;
	private String jour;

	@OneToMany(mappedBy = "jour", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	private boolean deleted = Boolean.FALSE;

	public Jour() {
		super();
	}

	public Jour(Long idJour, String jour, List<Seance> seances) {
		super();
		this.idJour = idJour;
		this.jour = jour;
		this.seances = seances;
	}

	public Jour(Long idJour, String jour, List<Seance> seances, boolean deleted) {
		super();
		this.idJour = idJour;
		this.jour = jour;
		this.seances = seances;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
