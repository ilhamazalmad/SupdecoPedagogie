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
@Table(name = "etudiantAnnee")
public class EtudiantAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEtudiantAnnee;
	private boolean depart;
	private Date dateDepart;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private Etudiant etudiant;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idGroupe", nullable = false)
	private Groupe groupe;

	@ManyToOne
	@JoinColumn(name = "idOption", nullable = true)
	private OptionAnnee optionAnnee;

	@ManyToMany
	@JoinTable(name = "etudiantSousGroupe", joinColumns = @JoinColumn(name = "idEtudiant"), inverseJoinColumns = @JoinColumn(name = "idSousGroupe"))
	private SousGroupeAnnee sousGroupe;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Controle> controles;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Examen> examens;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Rachetage> rachetages;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Numerotation> numerotations;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<AbsenceEtudiant> absenceEtudiants;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<ArretCours> arretCours;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<AvertissementAbsence> avertissementAbsences;

	public EtudiantAnnee() {
		super();
	}

	public EtudiantAnnee(int idEtudiantAnnee, boolean depart, Date dateDepart, Etudiant etudiant, Annee annee,
			Groupe groupe, OptionAnnee optionAnnee, SousGroupeAnnee sousGroupe, List<Controle> controles,
			List<Examen> examens, List<Rachetage> rachetages, List<Numerotation> numerotations,
			List<AbsenceEtudiant> absenceEtudiants, List<ArretCours> arretCours,
			List<AvertissementAbsence> avertissementAbsences) {
		super();
		this.idEtudiantAnnee = idEtudiantAnnee;
		this.depart = depart;
		this.dateDepart = dateDepart;
		this.etudiant = etudiant;
		this.annee = annee;
		this.groupe = groupe;
		this.optionAnnee = optionAnnee;
		this.sousGroupe = sousGroupe;
		this.controles = controles;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
		this.absenceEtudiants = absenceEtudiants;
		this.arretCours = arretCours;
		this.avertissementAbsences = avertissementAbsences;
	}

	public int getIdEtudiantAnnee() {
		return idEtudiantAnnee;
	}

	public void setIdEtudiantAnnee(int idEtudiantAnnee) {
		this.idEtudiantAnnee = idEtudiantAnnee;
	}

	public boolean isDepart() {
		return depart;
	}

	public void setDepart(boolean depart) {
		this.depart = depart;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
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

	public OptionAnnee getOptionAnnee() {
		return optionAnnee;
	}

	public void setOptionAnnee(OptionAnnee optionAnnee) {
		this.optionAnnee = optionAnnee;
	}

	public SousGroupeAnnee getSousGroupe() {
		return sousGroupe;
	}

	public void setSousGroupe(SousGroupeAnnee sousGroupe) {
		this.sousGroupe = sousGroupe;
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

	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	public void setNumerotations(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

	public List<AbsenceEtudiant> getAbsenceEtudiants() {
		return absenceEtudiants;
	}

	public void setAbsenceEtudiants(List<AbsenceEtudiant> absenceEtudiants) {
		this.absenceEtudiants = absenceEtudiants;
	}

	public List<ArretCours> getArretCours() {
		return arretCours;
	}

	public void setArretCours(List<ArretCours> arretCours) {
		this.arretCours = arretCours;
	}

	public List<AvertissementAbsence> getAvertissementAbsences() {
		return avertissementAbsences;
	}

	public void setAvertissementAbsences(List<AvertissementAbsence> avertissementAbsences) {
		this.avertissementAbsences = avertissementAbsences;
	}

}