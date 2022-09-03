package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Groupe {

private Long idGroupe;
	private String nomGroupe;
private List<GroupeAnnee> groupeAnnees;

	public Groupe() {
		super();
	}

	public Groupe(Long idGroupe, String nomGroupe, List<GroupeAnnee> groupeAnnees) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.groupeAnnees = groupeAnnees;
	}

	public Long getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(Long idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public List<GroupeAnnee> getGroupeAnnees() {
		return groupeAnnees;
	}

	public void setGroupeAnnees(List<GroupeAnnee> groupeAnnees) {
		this.groupeAnnees = groupeAnnees;
	}

}
