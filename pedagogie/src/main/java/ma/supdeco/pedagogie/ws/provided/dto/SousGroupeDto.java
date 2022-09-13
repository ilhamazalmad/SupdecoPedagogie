package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SousGroupeDto {

	private String idSsGroupe;
	private String ssGroupe;
	private List<SousGroupeAnneeDto> sousGroupeAnneeDtos;

	public SousGroupeDto() {
		super();
	}

	public SousGroupeDto(String idSsGroupe, String ssGroupe, List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		super();
		this.idSsGroupe = idSsGroupe;
		this.ssGroupe = ssGroupe;
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

	public String getIdSsGroupe() {
		return idSsGroupe;
	}

	public void setIdSsGroupe(String idSsGroupe) {
		this.idSsGroupe = idSsGroupe;
	}

	public String getSsGroupe() {
		return ssGroupe;
	}

	public void setSsGroupe(String ssGroupe) {
		this.ssGroupe = ssGroupe;
	}

	public List<SousGroupeAnneeDto> getSousGroupeAnnee() {
		return sousGroupeAnneeDtos;
	}

	public void setSousGroupeAnnee(List<SousGroupeAnneeDto> sousGroupeAnneeDtos) {
		this.sousGroupeAnneeDtos = sousGroupeAnneeDtos;
	}

}
