package ma.supdeco.pedagogie.bean;

import java.util.*;

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

@Entity
@Table(name = "optionAnnee")
public class OptionAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOptionAnnee;

	@ManyToOne
	@JoinColumn(name = "idOption", nullable = false)
	private Option option;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@OneToMany(mappedBy = "optionAnnee", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	@ManyToMany
	@JoinTable(name = "affectationOption", joinColumns = @JoinColumn(name = "idOption"), inverseJoinColumns = @JoinColumn(name = "idAffectation"))
	private List<AffectationMatiere> affectationMatieres = new ArrayList<>();

	public OptionAnnee() {
		super();
	}

	public OptionAnnee(Long idOptionAnnee, Option option, Annee annee, List<EtudiantAnnee> etudiantAnnees,
			List<AffectationMatiere> affectationMatieres) {
		super();
		this.idOptionAnnee = idOptionAnnee;
		this.option = option;
		this.annee = annee;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public Long getIdOptionAnnee() {
		return idOptionAnnee;
	}

	public void setIdOptionAnnee(Long idOptionAnnee) {
		this.idOptionAnnee = idOptionAnnee;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

	public List<AffectationMatiere> getAffectationMatieres() {
		return affectationMatieres;
	}

	public void setAffectationMatieres(List<AffectationMatiere> affectationMatieres) {
		this.affectationMatieres = affectationMatieres;
	}

}