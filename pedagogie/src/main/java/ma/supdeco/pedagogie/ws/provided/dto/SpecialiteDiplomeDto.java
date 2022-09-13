package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SpecialiteDiplomeDto {

	private String idSpecialite;
	private String specialiteDiplome;
	private String description;
	private List<EtudiantDto> etudiantDtos;

	public SpecialiteDiplomeDto() {
		super();
	}

	public SpecialiteDiplomeDto(String idSpecialite, String specialiteDiplome, String description,
			List<EtudiantDto> etudiantDtos) {
		super();
		this.idSpecialite = idSpecialite;
		this.specialiteDiplome = specialiteDiplome;
		this.description = description;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdSpecialite() {
		return idSpecialite;
	}

	public void setIdSpecialite(String idSpecialite) {
		this.idSpecialite = idSpecialite;
	}

	public String getSpecialiteDiplome() {
		return specialiteDiplome;
	}

	public void setSpecialiteDiplome(String specialiteDiplome) {
		this.specialiteDiplome = specialiteDiplome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
