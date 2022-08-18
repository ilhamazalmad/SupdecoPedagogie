package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "moduleAnnee")
public class ModuleAnnee extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idModuleAnnee;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idModule", nullable = false)
	private Module module;

	@ManyToOne
	@JoinColumn(name = "idSemestre", nullable = false)
	private SemestreNiveau semestreNiveau;

	@OneToMany(mappedBy = "moduleAnnee", cascade = CascadeType.MERGE)
	private List<MatiereAnnee> matiereAnnees;

	public ModuleAnnee() {
		super();
	}

	public ModuleAnnee(int idModuleAnnee, Annee annee, Module module, SemestreNiveau semestreNiveau,
			List<MatiereAnnee> matiereAnnees) {
		super();
		this.idModuleAnnee = idModuleAnnee;
		this.annee = annee;
		this.module = module;
		this.semestreNiveau = semestreNiveau;
		this.matiereAnnees = matiereAnnees;
	}

	public int getIdModuleAnnee() {
		return idModuleAnnee;
	}

	public void setIdModuleAnnee(int idModuleAnnee) {
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