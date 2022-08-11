package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Examen implements Serializable{
	   public Examen() {
		super();
	}
	public Examen(int idExamen, float noteExamen, boolean absence, boolean fraude) {
		super();
		this.idExamen = idExamen;
		this.noteExamen = noteExamen;
		this.absence = absence;
		this.fraude = fraude;
	}
	private int idExamen;
	   private float noteExamen;
	   private boolean absence;
	   private boolean fraude;
	public int getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}
	public float getNoteExamen() {
		return noteExamen;
	}
	public void setNoteExamen(float noteExamen) {
		this.noteExamen = noteExamen;
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
