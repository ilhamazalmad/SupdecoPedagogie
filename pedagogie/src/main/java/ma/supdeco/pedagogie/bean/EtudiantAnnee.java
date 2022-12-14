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

import ma.supdeco.pedagogie.bean.util.Auditable;

@Entity
@Table(name = "etudiantAnnee")
@SQLDelete(sql = "UPDATE etudiantAnnee SET deleted = true WHERE idEtudiantAnnee=?")
@Where(clause = "deleted=false")
public class EtudiantAnnee extends Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEtudiantAnnee;
	private boolean depart;
	private Date dateDepart;
	private String situation;

	@ManyToOne
	@JoinColumn(name = "idEtudiant", nullable = false)
	private Etudiant etudiant;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "idAnnee", nullable = false)
	private Annee annee;

	@ManyToOne
	@JoinColumn(name = "idGroupe", nullable = false)
	private GroupeAnnee groupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idOption", nullable = true)
	private OptionAnnee optionAnnee;

	@ManyToMany
	@JoinTable(name = "etudiantSousGroupe", joinColumns = @JoinColumn(name = "idEtudiant"), inverseJoinColumns = @JoinColumn(name = "idSousGroupe"))
	private List<SousGroupeAnnee> sousGroupeAnnees = new ArrayList<>();

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Controle> controles;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Examen> examens;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Rachetage> rachetages;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Numerotation> numerotations;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<Absence> absences;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<ArretCours> arretCours;

	@OneToMany(mappedBy = "etudiantAnnee", cascade = CascadeType.MERGE)
	private List<AvertissementAbsence> avertissementAbsences;

	private boolean deleted = Boolean.FALSE;

	public EtudiantAnnee() {
		super();
	}

	public EtudiantAnnee(Long idEtudiantAnnee, boolean depart, Date dateDepart, Etudiant etudiant, Niveau niveau,
			Annee annee, GroupeAnnee groupeAnnee, OptionAnnee optionAnnee, List<SousGroupeAnnee> sousGroupeAnnees,
			List<Controle> controles, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations, List<Absence> absences, List<ArretCours> arretCours,
			List<AvertissementAbsence> avertissementAbsences, String situation) {
		super();
		this.idEtudiantAnnee = idEtudiantAnnee;
		this.depart = depart;
		this.dateDepart = dateDepart;
		this.etudiant = etudiant;
		this.niveau = niveau;
		this.annee = annee;
		this.groupeAnnee = groupeAnnee;
		this.optionAnnee = optionAnnee;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.controles = controles;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
		this.absences = absences;
		this.arretCours = arretCours;
		this.avertissementAbsences = avertissementAbsences;
		this.situation = situation;

	}

	public EtudiantAnnee(Long idEtudiantAnnee, boolean depart, Date dateDepart, Etudiant etudiant, Niveau niveau,
			Annee annee, GroupeAnnee groupeAnnee, OptionAnnee optionAnnee, List<SousGroupeAnnee> sousGroupeAnnees,
			List<Controle> controles, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations, List<Absence> absences, List<ArretCours> arretCours,
			List<AvertissementAbsence> avertissementAbsences, boolean deleted, String situation) {
		super();
		this.idEtudiantAnnee = idEtudiantAnnee;
		this.depart = depart;
		this.dateDepart = dateDepart;
		this.etudiant = etudiant;
		this.niveau = niveau;
		this.annee = annee;
		this.groupeAnnee = groupeAnnee;
		this.optionAnnee = optionAnnee;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.controles = controles;
		this.examens = examens;
		this.rachetages = rachetages;
		this.numerotations = numerotations;
		this.absences = absences;
		this.arretCours = arretCours;
		this.avertissementAbsences = avertissementAbsences;
		this.deleted = deleted;
		this.situation = situation;

	}

	public List<Absence> getAbsences() {
		return absences;
	}

	public void setAbsences(List<Absence> absences) {
		this.absences = absences;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdEtudiantAnnee() {
		return idEtudiantAnnee;
	}

	public void setIdEtudiantAnnee(Long idEtudiantAnnee) {
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

	public GroupeAnnee getGroupeAnnee() {
		return groupeAnnee;
	}

	public void setGroupeAnnee(GroupeAnnee groupeAnnee) {
		this.groupeAnnee = groupeAnnee;
	}

	public OptionAnnee getOptionAnnee() {
		return optionAnnee;
	}

	public void setOptionAnnee(OptionAnnee optionAnnee) {
		this.optionAnnee = optionAnnee;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
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

	public List<Absence> getAbsenceEtudiants() {
		return absences;
	}

	public void setAbsenceEtudiants(List<Absence> absences) {
		this.absences = absences;
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

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

}