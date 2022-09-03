package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;
import java.util.Date;

public class EtudiantAnnee extends Auditable{

private Long idEtudiantAnnee;
	private boolean depart;
	private Date dateDepart;
private Etudiant etudiant;
private Niveau niveau;
private Annee annee;
private GroupeAnnee groupeAnnee;
private OptionAnnee optionAnnee;
private List<SousGroupeAnnee> sousGroupeAnnees;
private List<Controle> controles;
private List<Examen> examens;
private List<Rachetage> rachetages;
private List<Numerotation> numerotations;
private List<Absence> absences;
private List<ArretCours> arretCours;
private List<AvertissementAbsence> avertissementAbsences;

	public EtudiantAnnee() {
		super();
	}

	public EtudiantAnnee(Long idEtudiantAnnee, boolean depart, Date dateDepart, Etudiant etudiant, Niveau niveau,
			Annee annee, GroupeAnnee groupeAnnee, OptionAnnee optionAnnee, List<SousGroupeAnnee> sousGroupeAnnees,
			List<Controle> controles, List<Examen> examens, List<Rachetage> rachetages,
			List<Numerotation> numerotations, List<Absence> absences, List<ArretCours> arretCours,
			List<AvertissementAbsence> avertissementAbsences) {
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

}