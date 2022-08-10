package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tauxProf")
public class TauxProfesseur implements Serializable{
	   private int idTaux;
	   private float taux;
	   private int idNiveau;
	   private int idProfesseur;
	   private int idTypeSeance;

}
