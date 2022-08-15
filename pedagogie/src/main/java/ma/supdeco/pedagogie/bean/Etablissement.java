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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "etablissement")
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEtablissement;
	private String nomEtablissement;

	@ManyToMany
	@JoinTable(name = "etablissement_ville", joinColumns = @JoinColumn(name = "idEtablissement"), inverseJoinColumns = @JoinColumn(name = "idVille"))
	private List<Ville> villes;

	@OneToMany(mappedBy = "etablissement", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	public Etablissement() {
		super();
	}

	public Etablissement(int idEtablissement, String nomEtablissement, List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.idEtablissement = idEtablissement;
		this.nomEtablissement = nomEtablissement;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public int getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(int idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
