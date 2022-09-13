package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class MoisDto {

	private String idMois;
	private String mois;
	private List<EtudiantDto> etudiantDtos;

	public MoisDto() {
		super();
	}

	public MoisDto(String idMois, String mois, List<EtudiantDto> etudiantDtos) {
		super();
		this.idMois = idMois;
		this.mois = mois;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdMois() {
		return idMois;
	}

	public void setIdMois(String idMois) {
		this.idMois = idMois;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
