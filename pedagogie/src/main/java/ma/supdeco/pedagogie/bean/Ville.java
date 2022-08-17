package ma.supdeco.pedagogie.bean;

import java.util.List;

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
@Table(name = "ville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVille;
	private String ville;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	@OneToMany(mappedBy = "villeNaissance", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiantsNaissances;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.MERGE)
	private List<Professeur> professeurs;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.MERGE)
	private List<Tuteur> tuteurs;

	@OneToMany(mappedBy = "ville", cascade = CascadeType.MERGE)
	private List<Surveillant> surveillants;

	@ManyToOne
	@JoinColumn(name = "idPays", nullable = false)
	private Pays pays;

	@ManyToMany
	@JoinTable(name = "etablissement_ville", joinColumns = @JoinColumn(name = "idVille"), inverseJoinColumns = @JoinColumn(name = "idEtablissement"))
	private List<Etablissement> etablissements;

	@ManyToMany
	@JoinTable(name = "lycee_ville", joinColumns = @JoinColumn(name = "idVille"), inverseJoinColumns = @JoinColumn(name = "idLycee"))
	private List<Lycee> lycees;

	public Ville() {
		super();
	}

	public Ville(int idVille, String ville, List<Etudiant> etudiants, List<Etudiant> etudiantsNaissances,
			List<Professeur> professeurs, List<Tuteur> tuteurs, List<Surveillant> surveillants, Pays pays,
			List<Etablissement> etablissements, List<Lycee> lycees) {
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

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
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

	public List<Etablissement> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

	public List<Lycee> getLycees() {
		return lycees;
	}

	public void setLycees(List<Lycee> lycees) {
		this.lycees = lycees;
	}

}
