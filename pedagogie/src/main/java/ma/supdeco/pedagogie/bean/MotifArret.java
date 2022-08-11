package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="motifArret")

public class MotifArret {
	public MotifArret() {
		super();
	}
	public MotifArret(int idMotif, int motifArret) {
		super();
		this.idMotif = idMotif;
		this.motifArret = motifArret;
	}
	private int idMotif;
	   private int motifArret;
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
