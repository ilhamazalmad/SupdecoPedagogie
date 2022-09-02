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

@Entity
@Table(name = "semestreNiveau")
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