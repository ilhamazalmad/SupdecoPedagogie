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

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "groupeAnnee")
@SQLDelete(sql = "UPDATE groupeAnnee SET deleted = true WHERE idGroupeAnnee=?")
@Where(clause = "deleted=false")
public class GroupeAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGroupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idGroupe", nullable = false)
	private Groupe groupe;

	@OneToMany(mappedBy = "groupeAnnee", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	@ManyToMany
	@JoinTable(name = "affectationGroupe", joinColumns = @JoinColumn(name = "idGroupe"), inverseJoinColumns = @JoinColumn(name = "idAffectation"))
	private List<AffectationMatiere> affectationMatieres = new ArrayList<>();

	private boolean deleted = Boolean.FALSE;

	public GroupeAnnee() {
		super();
	}

	public GroupeAnnee(Long idGroupeAnnee, Niveau niveau, Annee annee, Groupe groupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.groupe = groupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public GroupeAnnee(Long idGroupeAnnee, Niveau niveau, Annee annee, Groupe groupe,
			List<EtudiantAnnee> etudiantAnnees, List<AffectationMatiere> affectationMatieres, boolean deleted) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.groupe = groupe;
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

	public Long getIdGroupeAnnee() {
		return idGroupeAnnee;
	}

	public void setIdGroupeAnnee(Long idGroupeAnnee) {
		this.idGroupeAnnee = idGroupeAnnee;
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

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
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