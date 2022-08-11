package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "controle")
public class Controle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idControle;
	private float note16;
	private float note4;
	private boolean absence;
	private boolean fraude;

	public Controle() {
		super();
	}

	public Controle(int idControle, float note16, float note4, boolean absence, boolean fraude) {
		super();
		this.idControle = idControle;
		this.note16 = note16;
		this.note4 = note4;
		this.absence = absence;
		this.fraude = fraude;
	}

	public int getIdControle() {
		return idControle;
	}

	public void setIdControle(int idControle) {
		this.idControle = idControle;
	}

	public float getNote16() {
		return note16;
	}

	public void setNote16(float note16) {
		this.note16 = note16;
	}

	public float getNote4() {
		return note4;
	}

	public void setNote4(float note4) {
		this.note4 = note4;
	}

	public boolean isAbsence() {
		return absence;
	}

	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	public boolean isFraude() {
		return fraude;
	}

	public void setFraude(boolean fraude) {
		this.fraude = fraude;
	}

}
