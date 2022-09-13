package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class PaysDto {

	private String codeIso3;
	private String pays;
	private List<VilleDto> villeDtos;
	private List<EtudiantDto> etudiantDtos;

	public PaysDto() {
		super();
	}

	public PaysDto(String codeIso3, String pays, List<VilleDto> villeDtos, List<EtudiantDto> etudiantDtos) {
		super();
		this.codeIso3 = codeIso3;
		this.pays = pays;
		this.villeDtos = villeDtos;
		this.etudiantDtos = etudiantDtos;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCodeIso3() {
		return codeIso3;
	}

	public void setCodeIso3(String codeIso3) {
		this.codeIso3 = codeIso3;
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
