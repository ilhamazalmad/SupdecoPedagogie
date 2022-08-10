package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "absenceMat")
public class AbsenceProfesseur implements Serializable{

	   private int idAbsence;
	   private boolean absent;
	   private int idProfesseur;
	   private int codeFiche;	
	
}
