package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;
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
	private int idSemestre;
	private String codeSemestre;
	private String titreSemestre;

	public SemestreNiveau[] semestreNiveau;

	public Semestre() {
		super();
	}

	public Semestre(int idSemestre, String codeSemestre, String titreSemestre, SemestreNiveau[] semestreNiveau) {
		super();
		this.idSemestre = idSemestre;
		this.codeSemestre = codeSemestre;
		this.titreSemestre = titreSemestre;
		this.semestreNiveau = semestreNiveau;
	}

	public int getIdSemestre() {
		return idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
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

	public SemestreNiveau[] getSemestreNiveau() {
		return semestreNiveau;
	}

	public void setSemestreNiveau(SemestreNiveau[] semestreNiveau) {
		this.semestreNiveau = semestreNiveau;
	}

}
