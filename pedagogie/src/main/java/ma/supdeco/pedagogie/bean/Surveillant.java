package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surveillant")
public class Surveillant implements Serializable{
	  private int idSurveillant;
	   private String nom;
	   private String prenom;
	   private String cin;
	   private String civilite;
	   private String telephone;
	   private String email;
}
