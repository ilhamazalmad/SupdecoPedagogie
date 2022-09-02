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
@Table(name = "professeurAnnee")
public class ProfesseurAnnee extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfesseurAnnee;

	@OneToMany(mappedBy = "professeurAnnee", cascade = CascadeType.MERGE)
	private List<AffectationMatiere> affectationMatieres;

	@ManyToOne
	@JoinColumn(name = "idProfesseur", nullable = false)
	private Professeur professeur;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	public ProfesseurAnnee() {
		super();
	}

	public ProfesseurAnnee(Long idProfesseurAnnee, List<AffectationMatiere> affectationMatieres, Professeur professeur,
			Annee annee) {
		super();
		this.idProfesseurAnnee = idProfesseurAnnee;
		this.affectationMatieres = affectationMatieres;
		this.professeur = professeur;
		this.annee = annee;
	}

	public Long getIdProfesseurAnnee() {
		return idProfesseurAnnee;
	}

	public void setIdProfesseurAnnee(Long idProfesseurAnnee) {
		this.idProfesseurAnnee = idProfesseurAnnee;
	}

	public List<AffectationMatiere> getAffectationMatieres() {
		return affectationMatieres;
	}

	public void setAffectationMatieres(List<AffectationMatiere> affectationMatieres) {
		this.affectationMatieres = affectationMatieres;
	}

	public Professeur getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professeur professeur) {
		this.professeur = professeur;
	}

	public Annee getAnnee() {
		return annee;
	}

	public void setAnnee(Annee annee) {
		this.annee = annee;
	}

}