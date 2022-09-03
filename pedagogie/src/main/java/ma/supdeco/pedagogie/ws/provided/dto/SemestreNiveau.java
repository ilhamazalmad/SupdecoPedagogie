package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class SemestreNiveau {

private Long idSemestreNiveau;
private List<ModuleAnnee> moduleAnnees;
private List<AvertissementAbsence> avertissementAbsences;
private Niveau niveau;
private Semestre semestre;

	public SemestreNiveau() {
		super();
	}

	public SemestreNiveau(Long idSemestreNiveau, List<ModuleAnnee> moduleAnnees,
			List<AvertissementAbsence> avertissementAbsences, Niveau niveau, Semestre semestre) {
		super();
		this.idSemestreNiveau = idSemestreNiveau;
		this.moduleAnnees = moduleAnnees;
		this.avertissementAbsences = avertissementAbsences;
		this.niveau = niveau;
		this.semestre = semestre;
	}

	public Long getIdSemestreNiveau() {
		return idSemestreNiveau;
	}

	public void setIdSemestreNiveau(Long idSemestreNiveau) {
		this.idSemestreNiveau = idSemestreNiveau;
	}

	public List<ModuleAnnee> getModuleAnnees() {
		return moduleAnnees;
	}

	public void setModuleAnnees(List<ModuleAnnee> moduleAnnees) {
		this.moduleAnnees = moduleAnnees;
	}

	public List<AvertissementAbsence> getAvertissementAbsences() {
		return avertissementAbsences;
	}

	public void setAvertissementAbsences(List<AvertissementAbsence> avertissementAbsences) {
		this.avertissementAbsences = avertissementAbsences;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}