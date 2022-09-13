package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class ResponsableInscriptionDto {

	private String idResponsable;
	private String nom;
	private List<EtudiantDto> etudiantDtos;

	public ResponsableInscriptionDto() {
		super();
	}

	public ResponsableInscriptionDto(String idResponsable, String nom, List<EtudiantDto> etudiantDtos) {
		super();
		this.idResponsable = idResponsable;
		this.nom = nom;
		this.etudiantDtos = etudiantDtos;
	}

	public String getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(String idResponsable) {
		this.idResponsable = idResponsable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<EtudiantDto> getEtudiants() {
		return etudiantDtos;
	}

	public void setEtudiants(List<EtudiantDto> etudiantDtos) {
		this.etudiantDtos = etudiantDtos;
	}

}
