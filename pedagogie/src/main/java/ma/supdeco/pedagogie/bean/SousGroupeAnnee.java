package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "sousGroupeAnnee")
@SQLDelete(sql = "UPDATE sousGroupeAnnee SET deleted = true WHERE idSsGroupeAnnee=?")
@Where(clause = "deleted=false")
public class SousGroupeAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSsGroupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idSousGroupe", nullable = false)
	private SousGroupe sousGroupe;

	@ManyToMany
	@JoinTable(name = "etudiantSousGroupe", joinColumns = @JoinColumn(name = "idSousGroupe"), inverseJoinColumns = @JoinColumn(name = "idEtudiant"))
	private List<EtudiantAnnee> etudiantAnnees = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "affectationSousGroupe", joinColumns = @JoinColumn(name = "idSousGroupe"), inverseJoinColumns = @JoinColumn(name = "idAffectation"))
	private List<AffectationMatiere> affectationMatieres = new ArrayList<>();

	private boolean deleted = Boolean.FALSE;

	public SousGroupeAnnee() {
		super();
	}

	public SousGroupeAnnee(Long idSsGroupeAnnee, Niveau niveau, Annee annee, SousGroupe sousGroupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres) {
		super();
		this.idSsGroupeAnnee = idSsGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.sousGroupe = sousGroupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public SousGroupeAnnee(Long idSsGroupeAnnee, Niveau niveau, Annee annee, SousGroupe sousGroupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres, boolean deleted) {
		super();
		this.idSsGroupeAnnee = idSsGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.sousGroupe = sousGroupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdSsGroupeAnnee() {
		return idSsGroupeAnnee;
	}

	public void setIdSsGroupeAnnee(Long idSsGroupeAnnee) {
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