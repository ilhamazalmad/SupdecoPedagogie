package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "motifArret")

public class MotifArret {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idMotif;
	private int motifArret;

	public MotifArret() {
		super();
	}

	public MotifArret(int idMotif, int motifArret) {
		super();
		this.idMotif = idMotif;
		this.motifArret = motifArret;
	}

	public int getIdMotif() {
		return idMotif;
	}

	public void setIdMotif(int idMotif) {
		this.idMotif = idMotif;
	}

	public int getMotifArret() {
		return motifArret;
	}

	public void setMotifArret(int motifArret) {
		this.motifArret = motifArret;
	}
}
