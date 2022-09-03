package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class ModuleAnnee extends Auditable{

private Long idModuleAnnee;
private Annee annee;
private Module module;
private SemestreNiveau semestreNiveau;
private List<MatiereAnnee> matiereAnnees;

	public ModuleAnnee() {
		super();
	}

	public ModuleAnnee(Long idModuleAnnee, Annee annee, Module module, SemestreNiveau semestreNiveau,
			List<MatiereAnnee> matiereAnnees) {
		super();
		this.idModuleAnnee = idModuleAnnee;
		this.annee = annee;
		this.module = module;
		this.semestreNiveau = semestreNiveau;
		this.matiereAnnees = matiereAnnees;
	}

	public Long getIdModuleAnnee() {
		return idModuleAnnee;
	}

	public void setIdModuleAnnee(Long idModuleAnnee) {
		this.idModuleAnnee = idModuleAnnee;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public SemestreNiveau getSemestreNiveau() {
		return semestreNiveau;
	}

	public void setSemestreNiveau(SemestreNiveau semestreNiveau) {
		this.semestreNiveau = semestreNiveau;
	}

	public List<MatiereAnnee> getMatiereAnnees() {
		return matiereAnnees;
	}

	public void setMatiereAnnees(List<MatiereAnnee> matiereAnnees) {
		this.matiereAnnees = matiereAnnees;
	}

}