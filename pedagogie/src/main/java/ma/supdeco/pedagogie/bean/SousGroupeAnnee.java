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
@Table(name = "sousGroupeAnnee")
public class SousGroupeAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSsGroupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idSousGroupe", nullable = false)
	private SousGroupe sousGroupe;

	@OneToMany(mappedBy = "sousGroupeAnnee", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	@ManyToMany
	@JoinTable(name = "affectationSousGroupe", joinColumns = @JoinColumn(name = "idSousGroupe"), inverseJoinColumns = @JoinColumn(name = "idAffectation"))
	private List<AffectationMatiere> affectationMatieres = new ArrayList<>();

	public SousGroupeAnnee() {
		super();
	}

	public SousGroupeAnnee(int idSsGroupeAnnee, Niveau niveau, Annee annee, SousGroupe sousGroupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres) {
		super();
		this.idSsGroupeAnnee = idSsGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.sousGroupe = sousGroupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public int getIdSsGroupeAnnee() {
		return idSsGroupeAnnee;
	}

	public void setIdSsGroupeAnnee(int idSsGroupeAnnee) {
		this.idSsGroupeAnnee = idSsGroupeAnnee;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

	public SousGroupe getSousGroupe() {
		return sousGroupe;
	}

	public void setSousGroupe(SousGroupe sousGroupe) {
		this.sousGroupe = sousGroupe;
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