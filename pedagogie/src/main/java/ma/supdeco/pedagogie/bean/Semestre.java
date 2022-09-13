package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "semestre")
@SQLDelete(sql = "UPDATE semestre SET deleted = true WHERE codeSemestre=?")
@Where(clause = "deleted=false")
public class Semestre {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeSemestre;
	private String titreSemestre;

	@OneToMany(mappedBy = "semestre", cascade = CascadeType.MERGE)
	private List<SemestreNiveau> semestreNiveau;

	private boolean deleted = Boolean.FALSE;

	public Semestre() {
		super();
	}

	public Semestre(String codeSemestre, String titreSemestre, List<SemestreNiveau> semestreNiveau) {
		super();
		this.codeSemestre = codeSemestre;
		this.titreSemestre = titreSemestre;
		this.semestreNiveau = semestreNiveau;
	}

	public Semestre(String codeSemestre, String titreSemestre, List<SemestreNiveau> semestreNiveau, boolean deleted) {
		super();
		this.codeSemestre = codeSemestre;
		this.titreSemestre = titreSemestre;
		this.semestreNiveau = semestreNiveau;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
