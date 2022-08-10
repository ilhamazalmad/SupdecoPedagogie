package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "absence")
public class AbsenceEtudiant implements Serializable{



	   private int idAbsence;
	   private boolean absent;
	   private boolean justifiee;
	   private String cause1;
	   private String cause2;
	   private int idEtudiant;
	   private int codeFiche;
	
}
