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
@Table(name = "sousGroupe")
public class SousGroupe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSsGroupe;
	private String ssGroupe;

	@OneToMany(mappedBy = "sousGroupe", cascade = CascadeType.MERGE)
	private List<SousGroupeAnnee> sousGroupeAnnees;

	public SousGroupe() {
		super();
	}

	public SousGroupe(int idSsGroupe, String ssGroupe, List<SousGroupeAnnee> sousGroupeAnnees) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnnees = sousGroupeAnnees;
	}

	public int getIdSsGroupe() {
		return idSsGroupe;
	}

	public void setIdSsGroupe(int idSsGroupe) {
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
