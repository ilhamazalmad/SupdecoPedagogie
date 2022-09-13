package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class NiveauAdmissionDto {

	private String idAdmission;
	private String niveauAdmission;
	private List<EtudiantDto> etudiantDtos;

	public NiveauAdmissionDto() {
		super();
	}

	public NiveauAdmissionDto(String idAdmission, String niveauAdmission, List<EtudiantDto> etudiantDtos) {
		super();
		this.idAdmission = idAdmission;
		this.niveauAdmission = niveauAdmission;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdAdmission() {
		return idAdmission;
	}

	public void setIdAdmission(String idAdmission) {
		this.idAdmission = idAdmission;
	}

	public String getNiveauAdmission() {
		return niveauAdmission;
	}

	public void setNiveauAdmission(String niveauAdmission) {
		this.niveauAdmission = niveauAdmission;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
