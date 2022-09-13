package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class EtablissementDiplomeDto {

	private String idEtablissement;
	private String nomEtablissement;
	private String typeEtablissement;
	private List<VilleDto> villeDtos;
	private List<EtudiantDto> etudiantDtos;

	public EtablissementDiplomeDto() {
		super();
	}

	public EtablissementDiplomeDto(String idEtablissement, String nomEtablissement, String typeEtablissement,
			List<VilleDto> villeDtos, List<EtudiantDto> etudiantDtos) {
		super();
		this.idEtablissement = idEtablissement;
		this.nomEtablissement = nomEtablissement;
		this.typeEtablissement = typeEtablissement;
		this.villeDtos = villeDtos;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdEtablissement() {
		return idEtablissement;
	}

	public void setIdEtablissement(String idEtablissement) {
		this.idEtablissement = idEtablissement;
	}

	public String getNomEtablissement() {
		return nomEtablissement;
	}

	public void setNomEtablissement(String nomEtablissement) {
		this.nomEtablissement = nomEtablissement;
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

	public String getTypeEtablissement() {
		return typeEtablissement;
	}

	public void setTypeEtablissement(String typeEtablissement) {
		this.typeEtablissement = typeEtablissement;
	}

}
