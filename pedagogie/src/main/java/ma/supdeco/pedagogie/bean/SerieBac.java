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
@Table(name = "serieBac")
@SQLDelete(sql = "UPDATE serieBac SET deleted = true WHERE idSerie=?")
@Where(clause = "deleted=false")
public class SerieBac {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSerie;
	private String serieBac;
	private String description;

	@OneToMany(mappedBy = "serieBac", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiants;

	private boolean deleted = Boolean.FALSE;

	public SerieBac() {
		super();
	}

	public SerieBac(Long idSerie, String serieBac, String description, List<Etudiant> etudiants) {
		super();
		this.idSerie = idSerie;
		this.serieBac = serieBac;
		this.description = description;
		this.etudiants = etudiants;
	}

	public SerieBac(Long idSerie, String serieBac, String description, List<Etudiant> etudiants, boolean deleted) {
		super();
		this.idSerie = idSerie;
		this.serieBac = serieBac;
		this.description = description;
		this.etudiants = etudiants;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	public String getSerieBac() {
		return serieBac;
	}

	public void setSerieBac(String serieBac) {
		this.serieBac = serieBac;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
