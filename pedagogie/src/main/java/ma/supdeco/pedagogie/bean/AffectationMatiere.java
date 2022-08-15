package ma.supdeco.pedagogie.bean;

import java.util.List;

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
@Table(name = "affectationMatiere")
public class AffectationMatiere {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAffectation;

	@OneToMany(mappedBy = "affecationMatiere", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	@ManyToOne
	@JoinColumn(name = "idGroupe", nullable = false)
	private GroupeAnnee groupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idProfesseur", nullable = false)
	private ProfesseurAnnee professeurAnnee;

	@ManyToOne
	@JoinColumn(name = "idOption", nullable = false)
	private OptionAnnee optionAnnee;

	@ManyToOne
	@JoinColumn(name = "idSousGroupe", nullable = false)
	private SousGroupeAnnee sousGroupeAnnee;

	@ManyToOne
	@JoinColumn(name = "idMatiere", nullable = false)
	private MatiereAnnee matiereAnnee;

	public int getIdAffectation() {
		return idAffectation;
	}

	public void setIdAffectation(int idAffectation) {
		this.idAffectation = idAffectation;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public GroupeAnnee getGroupeAnnee() {
		return groupeAnnee;
	}

	public void setGroupeAnnee(GroupeAnnee groupeAnnee) {
		this.groupeAnnee = groupeAnnee;
	}

	public ProfesseurAnnee getProfesseurAnnee() {
		return professeurAnnee;
	}

	public void setProfesseurAnnee(ProfesseurAnnee professeurAnnee) {
		this.professeurAnnee = professeurAnnee;
	}

	public OptionAnnee getOptionAnnee() {
		return optionAnnee;
	}

	public void setOptionAnnee(OptionAnnee optionAnnee) {
		this.optionAnnee = optionAnnee;
	}

	public SousGroupeAnnee getSousGroupeAnnee() {
		return sousGroupeAnnee;
	}

	public void setSousGroupeAnnee(SousGroupeAnnee sousGroupeAnnee) {
		this.sousGroupeAnnee = sousGroupeAnnee;
	}

	public MatiereAnnee getMatiereAnnee() {
		return matiereAnnee;
	}

	public void setMatiereAnnee(MatiereAnnee matiereAnnee) {
		this.matiereAnnee = matiereAnnee;
	}

	public AffectationMatiere(int idAffectation, List<Seance> seances, GroupeAnnee groupeAnnee,
			ProfesseurAnnee professeurAnnee, OptionAnnee optionAnnee, SousGroupeAnnee sousGroupeAnnee,
			MatiereAnnee matiereAnnee) {
		super();
		this.idAffectation = idAffectation;
		this.seances = seances;
		this.groupeAnnee = groupeAnnee;
		this.professeurAnnee = professeurAnnee;
		this.optionAnnee = optionAnnee;
		this.sousGroupeAnnee = sousGroupeAnnee;
		this.matiereAnnee = matiereAnnee;
	}

	public AffectationMatiere() {
		super();
	}

}
