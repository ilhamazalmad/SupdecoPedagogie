package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "diplome")
@SQLDelete(sql = "UPDATE diplome SET deleted = true WHERE idDiplome=?")
@Where(clause = "deleted=false")
public class Diplome {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDiplome;
	private String titreDiplome;

	@OneToMany(mappedBy = "diplome", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public Diplome() {
		super();
	}

	public Diplome(Long idDiplome, String titreDiplome, List<Etudiant> etudiants) {
		super();
		this.idDiplome = idDiplome;
		this.titreDiplome = titreDiplome;
		this.etudiants = etudiants;
	}

	public Diplome(Long idDiplome, String titreDiplome, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idDiplome = idDiplome;
		this.titreDiplome = titreDiplome;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(Long idDiplome) {
		this.idDiplome = idDiplome;
	}

	public String getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(String titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
