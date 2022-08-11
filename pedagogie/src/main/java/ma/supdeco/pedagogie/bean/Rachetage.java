package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rachetage")

public class Rachetage {
	public Rachetage() {
		super();
	}
	public Rachetage(int idRachetage, boolean rachetage) {
		super();
		this.idRachetage = idRachetage;
		this.rachetage = rachetage;
	}
	private int idRachetage;
	   private boolean rachetage;
	public int getIdRachetage() {
		return idRachetage;
	}
	public void setIdRachetage(int idRachetage) {
		this.idRachetage = idRachetage;
	}
	public boolean isRachetage() {
		return rachetage;
	}
	public void setRachetage(boolean rachetage) {
		this.rachetage = rachetage;
	}

}
