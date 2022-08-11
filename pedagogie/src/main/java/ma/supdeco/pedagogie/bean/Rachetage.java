package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rachetage")

public class Rachetage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRachetage;
	private boolean rachetage;

	public Rachetage() {
		super();
	}

	public Rachetage(int idRachetage, boolean rachetage) {
		super();
		this.idRachetage = idRachetage;
		this.rachetage = rachetage;
	}

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
