package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "semestre")
public class Semestre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeSemestre;
	private String titreSemestre;

	@OneToMany(mappedBy = "semestre", cascade = CascadeType.MERGE)
	private List<SemestreNiveau> semestreNiveau;

	public Semestre() {
		super();
	}

	public Semestre(String codeSemestre, String titreSemestre, List<SemestreNiveau> semestreNiveau) {
		super();
		this.codeSemestre = codeSemestre;
		this.titreSemestre = titreSemestre;
		this.semestreNiveau = semestreNiveau;
	}

	public String getCodeSemestre() {
		return codeSemestre;
	}

	public void setCodeSemestre(String codeSemestre) {
		this.codeSemestre = codeSemestre;
	}

	public String getTitreSemestre() {
		return titreSemestre;
	}

	public void setTitreSemestre(String titreSemestre) {
		this.titreSemestre = titreSemestre;
	}

	public List<SemestreNiveau> getSemestreNiveau() {
		return semestreNiveau;
	}

	public void setSemestreNiveau(List<SemestreNiveau> semestreNiveau) {
		this.semestreNiveau = semestreNiveau;
	}
	
	

}
