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
@Table(name = "sousGroupe")
@SQLDelete(sql = "UPDATE sousGroupe SET deleted = true WHERE idSsGroupe=?")
@Where(clause = "deleted=false")
public class SousGroupe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSsGroupe;
	private String ssGroupe;

	@OneToMany(mappedBy = "sousGroupe", cascade = CascadeType.MERGE)
	private List<SousGroupeAnnee> sousGroupeAnnees;

	private boolean deleted = Boolean.FALSE;

	public SousGroupe() {
		super();
	}

	public SousGroupe(Long idSsGroupe, String ssGroupe, List<SousGroupeAnnee> sousGroupeAnnees) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public SousGroupe(Long idSsGroupe, String ssGroupe, List<SousGroupeAnnee> sousGroupeAnnees, boolean deleted) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnnees = sousGroupeAnnees;
		this.deleted = deleted;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnees() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnees(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getIdSsGroupe() {
		return idSsGroupe;
	}

	public void setIdSsGroupe(Long idSsGroupe) {
		this.idSsGroupe = idSsGroupe;
	}

	public String getSsGroupe() {
		return ssGroupe;
	}

	public void setSsGroupe(String ssGroupe) {
		this.ssGroupe = ssGroupe;
	}

	public List<SousGroupeAnnee> getSousGroupeAnnee() {
		return sousGroupeAnnees;
	}

	public void setSousGroupeAnnee(List<SousGroupeAnnee> sousGroupeAnnees) {
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

}
