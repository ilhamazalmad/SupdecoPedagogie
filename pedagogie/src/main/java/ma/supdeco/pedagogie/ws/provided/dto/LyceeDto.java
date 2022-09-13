package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class LyceeDto {

	private String idLycee;
	private String nomLycee;
	private String typeLycee;
	private List<VilleDto> villeDtos;
	private List<EtudiantDto> etudiantDtos;

	public LyceeDto() {
		super();
	}

	public LyceeDto(String idLycee, String nomLycee, String typeLycee, List<VilleDto> villeDtos, List<EtudiantDto> etudiantDtos) {
		super();
		this.idLycee = idLycee;
		this.nomLycee = nomLycee;
		this.typeLycee = typeLycee;
		this.villeDtos = villeDtos;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdLycee() {
		return idLycee;
	}

	public void setIdLycee(String idLycee) {
		this.idLycee = idLycee;
	}

	public String getNomLycee() {
		return nomLycee;
	}

	public void setNomLycee(String nomLycee) {
		this.nomLycee = nomLycee;
	}

	public String getTypeLycee() {
		return typeLycee;
	}

	public void setTypeLycee(String typeLycee) {
		this.typeLycee = typeLycee;
	}

	public List<VilleDto> getVilles() {
		return villeDtos;
	}

	public void setVilles(List<VilleDto> villeDtos) {
		this.villeDtos = villeDtos;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
