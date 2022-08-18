package ma.supdeco.pedagogie.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "affectationMatiere")
public class AffectationMatiere extends Auditable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAffectation;

	@OneToMany(mappedBy = "affectationMatiere", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	@ManyToMany
	@JoinTable(name = "affectationGroupe", joinColumns = @JoinColumn(name = "idAffectation"), inverseJoinColumns = @JoinColumn(name = "idGroupe"))
	private List<GroupeAnnee> groupeAnnees = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idProfesseur", nullable = false)
	private ProfesseurAnnee professeurAnnee;

	@ManyToMany
	@JoinTable(name = "affectationOption", joinColumns = @JoinColumn(name = "idAffectation"), inverseJoinColumns = @JoinColumn(name = "idOption"))
	private List<OptionAnnee> optionAnnees = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "affectationSousGroupe", joinColumns = @JoinColumn(name = "idAffectation"), inverseJoinColumns = @JoinColumn(name = "idSousGroupe"))
	private List<SousGroupeAnnee> sousGroupeAnnees = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private MatiereAnnee matiereAnnee;

	public AffectationMatiere() {
		super();
	}

	public AffectationMatiere(int idAffectation, List<Seance> seances, List<GroupeAnnee> groupeAnnees,
			ProfesseurAnnee professeurAnnee, List<OptionAnnee> optionAnnees, List<SousGroupeAnnee> sousGroupeAnnees,
			MatiereAnnee matiereAnnee) {
		super();
		this.idAffectation = idAffectation;
		this.seances = seances;
		this.groupeAnnees = groupeAnnees;
		this.professeurAnnee = professeurAnnee;
		this.optionAnnees = optionAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.matiereAnnee = matiereAnnee;
	}

	public int getIdAffectation() {
		return idAffectation;
	}

	public void setIdAffectation(int idAffectation) {
		this.idAffectation = idAffectation;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public List<GroupeAnnee> getGroupeAnnees() {
		return groupeAnnees;
	}

	public void setGroupeAnnees(List<GroupeAnnee> groupeAnnees) {
		this.groupeAnnees = groupeAnnees;
	}

	public ProfesseurAnnee getProfesseurAnnee() {
		return professeurAnnee;
	}

	public void setProfesseurAnnee(ProfesseurAnnee professeurAnnee) {
		this.professeurAnnee = professeurAnnee;
	}

	public List<OptionAnnee> getOptionAnnees() {
		return optionAnnees;
	}

	public void setOptionAnnees(List<OptionAnnee> optionAnnees) {
		this.optionAnnees = optionAnnees;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public MatiereAnnee getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(MatiereAnnee matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

}
