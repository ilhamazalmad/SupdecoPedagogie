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

@Entity
@Table(name = "groupeAnnee")
public class GroupeAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroupeAnnee;

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

	@OneToMany(mappedBy = "groupeAnnee", cascade = CascadeType.MERGE)
	private List<AffectationMatiere> affectationMatieres;

	public GroupeAnnee() {
		super();
	}

	public GroupeAnnee(int idGroupeAnnee, Niveau niveau, Annee annee, Groupe groupe, List<EtudiantAnnee> etudiantAnnees,
			List<AffectationMatiere> affectationMatieres) {
		super();
		this.idGroupeAnnee = idGroupeAnnee;
		this.niveau = niveau;
		this.annee = annee;
		this.groupe = groupe;
		this.etudiantAnnees = etudiantAnnees;
		this.affectationMatieres = affectationMatieres;
	}

	public int getIdGroupeAnnee() {
		return idGroupeAnnee;
	}

	public void setIdGroupeAnnee(int idGroupeAnnee) {
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