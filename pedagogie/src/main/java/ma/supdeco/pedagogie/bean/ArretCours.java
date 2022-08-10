package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "arret")
public class ArretCours implements Serializable{
	private int idArret;
	   private Date dateDebut;
	   private Date dateFin;
	   private int motif;
	   private boolean active;
	   private int idEtudiant;
	   private int responsable;
}
