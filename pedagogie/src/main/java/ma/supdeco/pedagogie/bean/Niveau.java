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
@Table(name = "niveau")
@SQLDelete(sql = "UPDATE niveau SET deleted = true WHERE idNiveau=?")
@Where(clause = "deleted=false")
public class Niveau {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idNiveau;
	private String niveau;

	@OneToMany(mappedBy = "niveau", cascade = CascadeType.MERGE)
	public List<SemestreNiveau> semestreNiveaux;

	@OneToMany(mappedBy = "niveau", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	@OneToMany(mappedBy = "niveau", cascade = CascadeType.MERGE)
	private List<SousGroupeAnnee> sousGroupeAnnees;

	@OneToMany(mappedBy = "niveau", cascade = CascadeType.MERGE)
	private List<GroupeAnnee> groupeAnnees;

	private boolean deleted = Boolean.FALSE;

	public Niveau() {
		super();
	}

	public Niveau(Long idNiveau, String niveau, List<SemestreNiveau> semestreNiveaux,
			List<EtudiantAnnee> etudiantAnnees, List<SousGroupeAnnee> sousGroupeAnnees,
			List<GroupeAnnee> groupeAnnees) {
		super();
		this.idNiveau = idNiveau;
		this.niveau = niveau;
		this.semestreNiveaux = semestreNiveaux;
		this.etudiantAnnees = etudiantAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.groupeAnnees = groupeAnnees;
	}

	public Niveau(Long idNiveau, String niveau, List<SemestreNiveau> semestreNiveaux,
			List<EtudiantAnnee> etudiantAnnees, List<SousGroupeAnnee> sousGroupeAnnees, List<GroupeAnnee> groupeAnnees,
			boolean deleted) {
		super();
		this.idNiveau = idNiveau;
		this.niveau = niveau;
		this.semestreNiveaux = semestreNiveaux;
		this.etudiantAnnees = etudiantAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.groupeAnnees = groupeAnnees;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdNiveau() {
		return idNiveau;
	}

	public void setIdNiveau(Long idNiveau) {
		this.idNiveau = idNiveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public List<SemestreNiveau> getSemestreNiveaux() {
		return semestreNiveaux;
	}

	public void setSemestreNiveaux(List<SemestreNiveau> semestreNiveaux) {
		this.semestreNiveaux = semestreNiveaux;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public List<GroupeAnnee> getGroupeAnnees() {
		return groupeAnnees;
	}

	public void setGroupeAnnees(List<GroupeAnnee> groupeAnnees) {
		this.groupeAnnees = groupeAnnees;
	}

}
