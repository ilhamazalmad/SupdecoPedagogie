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
@Table(name = "matiereAnnee")
public class MatiereAnnee extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMatiereAnnee;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private Matiere matiere;

	@ManyToOne
	@JoinColumn(name = "idModule", nullable = false)
	private ModuleAnnee moduleAnnee;

	@OneToMany(mappedBy = "matiereAnnee", cascade = CascadeType.MERGE)
	private List<Controle> controles;

	@OneToMany(mappedBy = "matiereAnnee", cascade = CascadeType.MERGE)
	private List<Examen> examens;

	@OneToMany(mappedBy = "matiereAnnee", cascade = CascadeType.MERGE)
	private List<Rachetage> rachetages;

	@OneToMany(mappedBy = "matiereAnnee", cascade = CascadeType.MERGE)
	private List<AffectationMatiere> affectationMatieres;

	@OneToMany(mappedBy = "matiereAnnee", cascade = CascadeType.MERGE)
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