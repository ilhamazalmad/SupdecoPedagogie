package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class MatiereDto extends AuditableDto {

	private String codeMatiere;
	private String titreMatiere;
	private List<MatiereAnneeDto> matiereAnneeDto;

	public MatiereDto() {
		super();
	}

	public MatiereDto(String codeMatiere, String titreMatiere, List<MatiereAnneeDto> matiereAnneeDto) {
		super();
		this.codeMatiere = codeMatiere;
		this.titreMatiere = titreMatiere;
		this.matiereAnneeDto = matiereAnneeDto;
	}

	public String getCodeMatiere() {
		return codeMatiere;
	}

	public void setCodeMatiere(String codeMatiere) {
		this.codeMatiere = codeMatiere;
	}

	public String getTitreMatiere() {
		return titreMatiere;
	}

	public void setTitreMatiere(String titreMatiere) {
		this.titreMatiere = titreMatiere;
	}

	public List<MatiereAnneeDto> getMatiereAnnee() {
		return matiereAnneeDto;
	}

	public void setMatiereAnnee(List<MatiereAnneeDto> matiereAnneeDto) {
		this.matiereAnneeDto = matiereAnneeDto;
	}

}
