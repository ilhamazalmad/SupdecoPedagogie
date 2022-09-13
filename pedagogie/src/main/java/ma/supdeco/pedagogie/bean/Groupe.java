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
@Table(name = "groupe")
@SQLDelete(sql = "UPDATE groupe SET deleted = true WHERE idGroupe=?")
@Where(clause = "deleted=false")
public class Groupe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGroupe;
	private String nomGroupe;

	@OneToMany(mappedBy = "groupe", cascade = CascadeType.MERGE)
	private List<GroupeAnnee> groupeAnnees;

	private boolean deleted = Boolean.FALSE;

	public Groupe() {
		super();
	}

	public Groupe(Long idGroupe, String nomGroupe, List<GroupeAnnee> groupeAnnees) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.groupeAnnees = groupeAnnees;
	}

	public Groupe(Long idGroupe, String nomGroupe, List<GroupeAnnee> groupeAnnees, boolean deleted) {
		super();
		this.idGroupe = idGroupe;
		this.nomGroupe = nomGroupe;
		this.groupeAnnees = groupeAnnees;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
