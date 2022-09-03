package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Semestre {

private String codeSemestre;
	private String titreSemestre;
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
