package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rubProf")
public class RubriqueProfesseur implements Serializable{
	private int idRubrique;
	   private String rubrique;
	   private int idTaux;
	   private int idProfesseur;
	   private int idNiveau;
}
