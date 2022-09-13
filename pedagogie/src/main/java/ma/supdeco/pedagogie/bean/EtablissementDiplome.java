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

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "etablissement")
@SQLDelete(sql = "UPDATE etablissement SET deleted = true WHERE idEtablissement=?")
@Where(clause = "deleted=false")
public class EtablissementDiplome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEtablissement;
	private String nomEtablissement;
	private String typeEtablissement;

	@ManyToMany
	@JoinTable(name = "etablissement_ville", joinColumns = @JoinColumn(name = "idEtablissement"), inverseJoinColumns = @JoinColumn(name = "idVille"))
	private List<Ville> villes;

	@OneToMany(mappedBy = "etablissementDiplome", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public EtablissementDiplome() {
		super();
	}

	public EtablissementDiplome(Long idEtablissement, String nomEtablissement, String typeEtablissement,
			List<Ville> villes, List<Etudiant> etudiants) {
		super();
		this.idEtablissement = idEtablissement;
		this.nomEtablissement = nomEtablissement;
		this.typeEtablissement = typeEtablissement;
		this.villes = villes;
		this.etudiants = etudiants;
	}

	public EtablissementDiplome(Long idEtablissement, String nomEtablissement, String typeEtablissement,
			List<Ville> villes, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idEtablissement = idEtablissement;
		this.nomEtablissement = nomEtablissement;
		this.typeEtablissement = typeEtablissement;
		this.villes = villes;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(Long idEtablissement) {
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

	public String getTypeEtablissement() {
		return typeEtablissement;
	}

	public void setTypeEtablissement(String typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

}
