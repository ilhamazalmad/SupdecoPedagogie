package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Niveau {

private Long idNiveau;
	private String niveau;
public List<SemestreNiveau> semestreNiveaux;
private List<EtudiantAnnee> etudiantAnnees;
private List<SousGroupeAnnee> sousGroupeAnnees;
private List<GroupeAnnee> groupeAnnees;

	public Niveau() {
		super();
	}

	public Niveau(Long idNiveau, String niveau, List<SemestreNiveau> semestreNiveaux, List<EtudiantAnnee> etudiantAnnees,
			List<SousGroupeAnnee> sousGroupeAnnees, List<GroupeAnnee> groupeAnnees) {
		super();
		this.idNiveau = idNiveau;
		this.niveau = niveau;
		this.semestreNiveaux = semestreNiveaux;
		this.etudiantAnnees = etudiantAnnees;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.groupeAnnees = groupeAnnees;
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
