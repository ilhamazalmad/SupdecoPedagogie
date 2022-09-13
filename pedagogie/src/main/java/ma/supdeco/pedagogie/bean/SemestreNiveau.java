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

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "semestreNiveau")
@SQLDelete(sql = "UPDATE semestreNiveau SET deleted = true WHERE idSemestreNiveau=?")
@Where(clause = "deleted=false")
public class SemestreNiveau {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSemestreNiveau;

	@OneToMany(mappedBy = "semestreNiveau", cascade = CascadeType.MERGE)
	private List<ModuleAnnee> moduleAnnees;

	@OneToMany(mappedBy = "semestreNiveau", cascade = CascadeType.MERGE)
	private List<AvertissementAbsence> avertissementAbsences;

	@ManyToOne
	@JoinColumn(name = "idNiveau", nullable = false)
	private Niveau niveau;

	@ManyToOne
	@JoinColumn(name = "idSemestre", nullable = false)
	private Semestre semestre;

	private boolean deleted = Boolean.FALSE;

	public SemestreNiveau() {
		super();
	}

	public SemestreNiveau(Long idSemestreNiveau, List<ModuleAnnee> moduleAnnees,
			List<AvertissementAbsence> avertissementAbsences, Niveau niveau, Semestre semestre) {
		super();
		this.idSemestreNiveau = idSemestreNiveau;
		this.moduleAnnees = moduleAnnees;
		this.avertissementAbsences = avertissementAbsences;
		this.niveau = niveau;
		this.semestre = semestre;
	}

	public SemestreNiveau(Long idSemestreNiveau, List<ModuleAnnee> moduleAnnees,
			List<AvertissementAbsence> avertissementAbsences, Niveau niveau, Semestre semestre, boolean deleted) {
		super();
		this.idSemestreNiveau = idSemestreNiveau;
		this.moduleAnnees = moduleAnnees;
		this.avertissementAbsences = avertissementAbsences;
		this.niveau = niveau;
		this.semestre = semestre;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdSemestreNiveau() {
		return idSemestreNiveau;
	}

	public void setIdSemestreNiveau(Long idSemestreNiveau) {
		this.idSemestreNiveau = idSemestreNiveau;
	}

	public List<ModuleAnnee> getModuleAnnees() {
		return moduleAnnees;
	}

	public void setModuleAnnees(List<ModuleAnnee> moduleAnnees) {
		this.moduleAnnees = moduleAnnees;
	}

	public List<AvertissementAbsence> getAvertissementAbsences() {
		return avertissementAbsences;
	}

	public void setAvertissementAbsences(List<AvertissementAbsence> avertissementAbsences) {
		this.avertissementAbsences = avertissementAbsences;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}