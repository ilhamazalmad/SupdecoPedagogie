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
@Table(name = "motifArret")
public class MotifArret {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMotif;
	private int motifArret;

	@OneToMany(mappedBy = "motifArret", cascade = CascadeType.MERGE)
	private List<ArretCours> arretsCours;

	public MotifArret() {
		super();
	}

	public MotifArret(Long idMotif, int motifArret, List<ArretCours> arretsCours) {
		super();
		this.idMotif = idMotif;
		this.motifArret = motifArret;
		this.arretsCours = arretsCours;
	}

	public Long getIdMotif() {
		return idMotif;
	}

	public void setIdMotif(Long idMotif) {
		this.idMotif = idMotif;
	}

	public int getMotifArret() {
		return motifArret;
	}

	public void setMotifArret(int motifArret) {
		this.motifArret = motifArret;
	}

	public List<ArretCours> getArretsCours() {
		return arretsCours;
	}

	public void setArretsCours(List<ArretCours> arretsCours) {
		this.arretsCours = arretsCours;
	}

}
