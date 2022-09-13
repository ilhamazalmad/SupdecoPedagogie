package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class SerieBacDto {

	private String idSerie;
	private String serieBac;
	private String description;
	private List<EtudiantDto> etudiantDtos;

	public SerieBacDto() {
		super();
	}

	public SerieBacDto(String idSerie, String serieBac, String description, List<EtudiantDto> etudiantDtos) {
		super();
		this.idSerie = idSerie;
		this.serieBac = serieBac;
		this.description = description;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(String idSerie) {
		this.idSerie = idSerie;
	}

	public String getSerieBac() {
		return serieBac;
	}

	public void setSerieBac(String serieBac) {
		this.serieBac = serieBac;
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
