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
	   private int idExamen;
	   private float noteExamen;
	   private boolean absence;
	   private boolean fraude;
}
