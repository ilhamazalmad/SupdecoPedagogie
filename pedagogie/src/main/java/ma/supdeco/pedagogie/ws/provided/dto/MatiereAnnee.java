package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class MatiereAnnee extends Auditable{

private Long idMatiereAnnee;
private Annee annee;
private Matiere matiere;
private ModuleAnnee moduleAnnee;
private List<Controle> controles;
private List<Examen> examens;
private List<Rachetage> rachetages;
private List<AffectationMatiere> affectationMatieres;
private List<Numerotation> numerotations;

	public MatiereAnnee() {
		super();
	}

	public MatiereAnnee(Long idMatiereAnnee, Annee annee, Matiere matiere, ModuleAnnee moduleAnnee,
			List<Controle> controles, List<Examen> examens, List<Rachetage> rachetages,
			List<AffectationMatiere> affectationMatieres, List<Numerotation> numerotations) {
		super();
		this.idMatiereAnnee = idMatiereAnnee;
		this.annee = annee;
		this.matiere = matiere;
		this.moduleAnnee = moduleAnnee;
		this.controles = controles;
		this.examens = examens;
		this.rachetages = rachetages;
		this.affectationMatieres = affectationMatieres;
		this.numerotations = numerotations;
	}

	public Long getIdMatiereAnnee() {
		return idMatiereAnnee;
	}

	public void setIdMatiereAnnee(Long idMatiereAnnee) {
		this.idMatiereAnnee = idMatiereAnnee;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public ModuleAnnee getModuleAnnee() {
		return moduleAnnee;
	}

	public void setModuleAnnee(ModuleAnnee moduleAnnee) {
		this.moduleAnnee = moduleAnnee;
	}

	public List<Controle> getControles() {
		return controles;
	}

	public void setControles(List<Controle> controles) {
		this.controles = controles;
	}

	public List<Examen> getExamens() {
		return examens;
	}

	public void setExamens(List<Examen> examens) {
		this.examens = examens;
	}

	public List<Rachetage> getRachetages() {
		return rachetages;
	}

	public void setRachetages(List<Rachetage> rachetages) {
		this.rachetages = rachetages;
	}

	public List<AffectationMatiere> getAffectationMatieres() {
		return affectationMatieres;
	}

	public void setAffectationMatieres(List<AffectationMatiere> affectationMatieres) {
		this.affectationMatieres = affectationMatieres;
	}

	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	public void setNumerotations(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

}