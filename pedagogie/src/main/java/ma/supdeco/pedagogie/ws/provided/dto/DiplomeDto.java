package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class DiplomeDto {

	private String idDiplome;
	private String titreDiplome;
	private List<EtudiantDto> etudiantDtos;

	public DiplomeDto() {
		super();
	}

	public DiplomeDto(String idDiplome, String titreDiplome, List<EtudiantDto> etudiantDtos) {
		super();
		this.idDiplome = idDiplome;
		this.titreDiplome = titreDiplome;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdDiplome() {
		return idDiplome;
	}

	public void setIdDiplome(String idDiplome) {
		this.idDiplome = idDiplome;
	}

	public String getTitreDiplome() {
		return titreDiplome;
	}

	public void setTitreDiplome(String titreDiplome) {
		this.titreDiplome = titreDiplome;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
