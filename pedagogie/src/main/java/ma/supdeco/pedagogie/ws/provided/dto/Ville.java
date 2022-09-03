package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Ville {

	private Long idVille;
	private String ville;
	private List<Etudiant> etudiants;
	private List<Etudiant> etudiantsNaissances;
	private List<Professeur> professeurs;
	private List<Tuteur> tuteurs;
	private List<Surveillant> surveillants;
	private Pays pays;
	private List<EtablissementDiplome> etablissements;
	private List<Lycee> lycees;

	public Ville() {
		super();
	}

	public Ville(Long idVille, String ville, List<Etudiant> etudiants, List<Etudiant> etudiantsNaissances,
			List<Professeur> professeurs, List<Tuteur> tuteurs, List<Surveillant> surveillants, Pays pays,
			List<EtablissementDiplome> etablissements, List<Lycee> lycees) {
		super();
		this.idVille = idVille;
		this.ville = ville;
		this.etudiants = etudiants;
		this.etudiantsNaissances = etudiantsNaissances;
		this.professeurs = professeurs;
		this.tuteurs = tuteurs;
		this.surveillants = surveillants;
		this.pays = pays;
		this.etablissements = etablissements;
		this.lycees = lycees;
	}

	public Long getIdVille() {
		return idVille;
	}

	public void setIdVille(Long idVille) {
		this.idVille = idVille;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Etudiant> getEtudiantsNaissances() {
		return etudiantsNaissances;
	}

	public void setEtudiantsNaissances(List<Etudiant> etudiantsNaissances) {
		this.etudiantsNaissances = etudiantsNaissances;
	}

	public List<Professeur> getProfesseurs() {
		return professeurs;
	}

	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	public List<Tuteur> getTuteurs() {
		return tuteurs;
	}

	public void setTuteurs(List<Tuteur> tuteurs) {
		this.tuteurs = tuteurs;
	}

	public List<Surveillant> getSurveillants() {
		return surveillants;
	}

	public void setSurveillants(List<Surveillant> surveillants) {
		this.surveillants = surveillants;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public List<EtablissementDiplome> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<EtablissementDiplome> etablissements) {
		this.etablissements = etablissements;
	}

	public List<Lycee> getLycees() {
		return lycees;
	}

	public void setLycees(List<Lycee> lycees) {
		this.lycees = lycees;
	}

}
