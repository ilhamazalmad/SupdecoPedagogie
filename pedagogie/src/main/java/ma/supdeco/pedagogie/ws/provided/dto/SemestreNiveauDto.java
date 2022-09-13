package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SemestreNiveauDto {

	private String idSemestreNiveau;
	private List<ModuleAnneeDto> moduleAnneeDtos;
	private List<AvertissementAbsenceDto> avertissementAbsenceDtos;
	private NiveauDto niveauDto;
	private SemestreDto semestreDto;

	public SemestreNiveauDto() {
		super();
	}

	public SemestreNiveauDto(String idSemestreNiveau, List<ModuleAnneeDto> moduleAnneeDtos,
			List<AvertissementAbsenceDto> avertissementAbsenceDtos, NiveauDto niveauDto, SemestreDto semestreDto) {
		super();
		this.idSemestreNiveau = idSemestreNiveau;
		this.moduleAnneeDtos = moduleAnneeDtos;
		this.avertissementAbsenceDtos = avertissementAbsenceDtos;
		this.niveauDto = niveauDto;
		this.semestreDto = semestreDto;
	}

	public String getIdSemestreNiveau() {
		return idSemestreNiveau;
	}

	public void setIdSemestreNiveau(String idSemestreNiveau) {
		this.idSemestreNiveau = idSemestreNiveau;
	}

	public List<ModuleAnneeDto> getModuleAnnees() {
		return moduleAnneeDtos;
	}

	public void setModuleAnnees(List<ModuleAnneeDto> moduleAnneeDtos) {
		this.moduleAnneeDtos = moduleAnneeDtos;
	}

	public List<AvertissementAbsenceDto> getAvertissementAbsences() {
		return avertissementAbsenceDtos;
	}

	public void setAvertissementAbsences(List<AvertissementAbsenceDto> avertissementAbsenceDtos) {
		this.avertissementAbsenceDtos = avertissementAbsenceDtos;
	}

	public NiveauDto getNiveau() {
		return niveauDto;
	}

	public void setNiveau(NiveauDto niveauDto) {
		this.niveauDto = niveauDto;
	}

	public SemestreDto getSemestre() {
		return semestreDto;
	}

	public void setSemestre(SemestreDto semestreDto) {
		this.semestreDto = semestreDto;
	}

}