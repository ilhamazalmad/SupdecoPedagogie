package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "semestre")

public class Semestre implements Serializable{
	   private int idSemestre;
	   private String codeSemestre;
	   private String titreSemestre;
	   
	   public SemestreNiveau[] semestreNiveau;
	
}
