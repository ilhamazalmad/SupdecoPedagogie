package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class SousGroupe {

private Long idSsGroupe;
	private String ssGroupe;
private List<SousGroupeAnnee> sousGroupeAnnees;

	public SousGroupe() {
		super();
	}

	public SousGroupe(Long idSsGroupe, String ssGroupe, List<SousGroupeAnnee> sousGroupeAnnees) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnnees = sousGroupeAnnees;
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
