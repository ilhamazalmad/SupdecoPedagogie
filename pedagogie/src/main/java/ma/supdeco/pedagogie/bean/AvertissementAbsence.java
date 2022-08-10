package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avertissement")
public class AvertissementAbsence implements Serializable {
	private int idAvertissement;
	   private int absAvertissement;
	   private int absConseil;
	   private int absEngage;
	   private boolean avertis;
	   private boolean conseil;
	   private boolean presentConseil;
	   private boolean engage;
	   private boolean fin;
	   private Date dateAvertissement;
	   private Date dateConseil;
	   private Date dateEngagement;
	   private int idEtudiant;
	   private int idSemestre;
	
}
