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
@Table(name = "controle")
public class Controle implements Serializable{
	   private int idControle;
	   private float note16;
	   private float note4;
	   private boolean absence;
	   private boolean fraude;

}
