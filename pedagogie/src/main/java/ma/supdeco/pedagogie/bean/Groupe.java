package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroupe;
	private String nomGroupe;

	@OneToMany(mappedBy = "groupe", cascade = CascadeType.MERGE)
	private List<GroupeAnnee> groupeAnnees;

	public Groupe() {
		super();
	}

	public Groupe(int idGroupe, String nomGroupe, List<GroupeAnnee> groupeAnnees) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.groupeAnnees = groupeAnnees;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
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
