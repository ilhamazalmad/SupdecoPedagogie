package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SemestreDto {

	private String codeSemestre;
	private String titreSemestre;
	private List<SemestreNiveauDto> semestreNiveauDto;

	public SemestreDto() {
		super();
	}

	public SemestreDto(String codeSemestre, String titreSemestre, List<SemestreNiveauDto> semestreNiveauDto) {
		super();
		this.codeSemestre = codeSemestre;
		this.titreSemestre = titreSemestre;
		this.semestreNiveauDto = semestreNiveauDto;
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

	public List<SemestreNiveauDto> getSemestreNiveau() {
		return semestreNiveauDto;
	}

	public void setSemestreNiveau(List<SemestreNiveauDto> semestreNiveauDto) {
		this.semestreNiveauDto = semestreNiveauDto;
	}

}
